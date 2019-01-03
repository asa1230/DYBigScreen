package com.dayang.newmedia.common.utils;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Method;

/**
 * User: herry
 * Date: 16-3-8 09:27
 */
public class ParseXMLUtil {
    public static Logger logger = Logger.getLogger(ParseXMLUtil.class);

     /**
     * 输入为xml字符串,得到Document
     *
     * @param xmlStr
     */
    public static Document getDocument(String xmlStr) throws ParserConfigurationException, SAXException, SAXParseException, IOException {
        StringReader sr = new StringReader(xmlStr);
        InputSource in = new InputSource(sr);

        DocumentBuilderFactory dfactory = DocumentBuilderFactory.newInstance();
        dfactory.setNamespaceAware(false);
        return dfactory.newDocumentBuilder().parse(in);

    }

    private static Object createInstance(String className, Class expectClass) {
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            if (classLoader == null) {
                classLoader = ParseXMLUtil.class.getClassLoader();
            }

            Class clazz;
            if (classLoader != null)
                clazz = classLoader.loadClass(className);
            else
                clazz = Class.forName(className);
            Object obj = clazz.newInstance();
            if (expectClass == null || expectClass.isInstance(obj)) {
                return obj;
            }
        } catch (Throwable t) {
            logger.warn("Instance " + className + " fail!");
        }
        return null;
    }

    private static XPathFactory xpathFactory = null;

    private static synchronized XPathFactory getXPathFactory() {
        if (xpathFactory == null) {
            xpathFactory = XPathFactory.newInstance();
        }
        return xpathFactory;

    }

    public static XPath getXPath() {
        XPath xpath = getXPathFactory().newXPath();
        // xpath.setNamespaceContext(getNamespaceContext());
        //  xpath.setXPathFunctionResolver(new XPathFunctionExtResolver());
        return xpath;
    }

    private static TransformerFactory transformerFactory = null;

    public static synchronized TransformerFactory getTransformerFactory() {
        if (transformerFactory == null) {
            transformerFactory = TransformerFactory.newInstance();
        }
        return transformerFactory;
    }


    public static NodeList evalXPathAsNodeList(String expression, Document doc) throws Exception {
        return (NodeList) getXPath().evaluate(expression, doc, XPathConstants.NODESET);
    }

    public static NodeList evalXPathAsNodeList(String expression, Node node) throws Exception {
        return (NodeList) getXPath().evaluate(expression, node, XPathConstants.NODESET);
    }

    //for over saxon 9.0.1.5
    public static java.util.ArrayList evalXPathAsArrayList(String expression, Document doc) throws Exception {
        return (java.util.ArrayList) getXPath().evaluate(expression, doc, XPathConstants.NODESET);
    }

    public static Node evalXPathAsNode(String expression, Document doc) throws Exception {
        return (Node) getXPath().evaluate(expression, doc, XPathConstants.NODE);
    }

    public static Node evalXPathAsNode(String expression, Node node)
            throws Exception {
        return (Node) getXPath().evaluate(expression, node, XPathConstants.NODE);
    }

    public static String evalPathAsString(String expression, Document doc) throws Exception {
        return (String) getXPath().evaluate(expression, doc, XPathConstants.STRING);
    }


    public static NodeList parseXPath2(String expression, Document doc) throws Exception {
        String s = getXPath().evaluate(expression, doc);
        StringBuffer buf = new StringBuffer();
        buf.append("<xpathResult>").append(s).append("</xpathResult>");
        Document result = getDocument(buf.toString());
        return result.getFirstChild().getChildNodes();
    }

    public static Object parseXPath3(String expression, Document obj) throws Exception {
        XPathExpression expr = getXPath().compile(expression);
        Object result;
        try {
            result = expr.evaluate(obj, XPathConstants.NODESET);
        } catch (Exception e) {
            result = expr.evaluate(obj, XPathConstants.STRING);
        }
        return result;
    }


    /**
     * 这个函数是
     *
     * @param expression xpath表达式
     * @param obj        这里为document
     */
    public static Boolean parseXPathAsBoolean(String expression, Document obj) throws Exception {
        return (Boolean) getXPath().evaluate(expression, obj, XPathConstants.BOOLEAN);
    }

    /**
     * @param expression xpath表达式
     * @param obj        这里为document
     */
    public static NodeList parseXPath(String expression, Document obj) throws Exception {
        return (NodeList) getXPath().evaluate(expression, obj, XPathConstants.NODESET);
    }


    public static Object parseXPath(String expression, Document obj, QName qname) throws Exception {
        return getXPath().evaluate(expression, obj, qname);
    }

    /**
     * Decide if the node is text, and so must be handled specially
     */
    public static boolean isTextNode(Node n) {
        short nodeType = n.getNodeType();
        return nodeType == Node.CDATA_SECTION_NODE || nodeType == Node.TEXT_NODE || nodeType == Node.ATTRIBUTE_NODE;
    }


    /**
     * ******************************************************************
     * xslt转换(测试样例见saxontest的测试Module)
     *
     * @param xmlStr  *
     * @param xsltStr *
     *                *****************************************************************
     * caution:当xmlStr超过3000行时，saxon执行xslt转换会出现类似net.sf.saxon.event.NoOpenStartTagException: A namespace node (ns3881) cannot be created after the children of the containing element的异常
     */

    public static String parseXSLT(String xmlStr, String xsltStr) throws Exception {
        Document doc = getDocument(xmlStr);
        return parseXSLT(doc, xsltStr);
    }

    public static String parseXSLT(Document doc, String xslt) throws Exception {
        Source xsltSource = new StreamSource(new StringReader(xslt));
        return parseXSLT(doc, xsltSource);
    }

    public static String parseXSLT(Document doc, File xsltFile) throws Exception {
        Source xsltSource = new StreamSource(xsltFile);
        return parseXSLT(doc, xsltSource);
    }

    protected static String parseXSLT(Document doc, Source xsltSource) throws Exception {
        Transformer transformer = getTransformerFactory().newTransformer(xsltSource);
        StringWriter sw = new StringWriter();
        transformer.transform(new DOMSource(doc), new StreamResult(sw));
        return sw.toString();
    }

    public static Document parseJavaClz(Document doc, String clzName, String functionName) throws Exception {
        Class clz = Class.forName(clzName);
        Class[] paramaterClzArr = new Class[]{Document.class};
        Object[] objArr = new Object[]{doc};
        Method method = clz.getMethod(functionName, paramaterClzArr);
        return (Document) method.invoke(clz, objArr);
    }

    public static String nodeToString(Node node) throws Exception {
        StringWriter writer = new StringWriter();
        TransformerFactory transformFactory = TransformerFactory.newInstance();
        Transformer transformer = transformFactory.newTransformer();
        transformer.transform(new DOMSource(node), new StreamResult(writer));
        return writer.toString();
    }


}


