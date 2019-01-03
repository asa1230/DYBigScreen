/**
 * ResourceEntityResourceMetaDataInfoFormat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class ResourceEntityResourceMetaDataInfoFormat  implements java.io.Serializable {
    private java.lang.String totalLength;

    private MREML_pkg.ResourceEntityResourceMetaDataInfoFormatMarkPoint[] markPoint;

    private java.lang.Integer inPoint;

    private java.lang.Integer outPoint;

    private java.lang.String tapeID;

    private java.lang.Integer tapeTrimIn;

    private java.lang.Integer tapeTrimOut;

    private java.lang.String markSign;

    public ResourceEntityResourceMetaDataInfoFormat() {
    }

    public ResourceEntityResourceMetaDataInfoFormat(
           java.lang.String totalLength,
           MREML_pkg.ResourceEntityResourceMetaDataInfoFormatMarkPoint[] markPoint,
           java.lang.Integer inPoint,
           java.lang.Integer outPoint,
           java.lang.String tapeID,
           java.lang.Integer tapeTrimIn,
           java.lang.Integer tapeTrimOut,
           java.lang.String markSign) {
           this.totalLength = totalLength;
           this.markPoint = markPoint;
           this.inPoint = inPoint;
           this.outPoint = outPoint;
           this.tapeID = tapeID;
           this.tapeTrimIn = tapeTrimIn;
           this.tapeTrimOut = tapeTrimOut;
           this.markSign = markSign;
    }


    /**
     * Gets the totalLength value for this ResourceEntityResourceMetaDataInfoFormat.
     * 
     * @return totalLength
     */
    public java.lang.String getTotalLength() {
        return totalLength;
    }


    /**
     * Sets the totalLength value for this ResourceEntityResourceMetaDataInfoFormat.
     * 
     * @param totalLength
     */
    public void setTotalLength(java.lang.String totalLength) {
        this.totalLength = totalLength;
    }


    /**
     * Gets the markPoint value for this ResourceEntityResourceMetaDataInfoFormat.
     * 
     * @return markPoint
     */
    public MREML_pkg.ResourceEntityResourceMetaDataInfoFormatMarkPoint[] getMarkPoint() {
        return markPoint;
    }


    /**
     * Sets the markPoint value for this ResourceEntityResourceMetaDataInfoFormat.
     * 
     * @param markPoint
     */
    public void setMarkPoint(MREML_pkg.ResourceEntityResourceMetaDataInfoFormatMarkPoint[] markPoint) {
        this.markPoint = markPoint;
    }

    public MREML_pkg.ResourceEntityResourceMetaDataInfoFormatMarkPoint getMarkPoint(int i) {
        return this.markPoint[i];
    }

    public void setMarkPoint(int i, MREML_pkg.ResourceEntityResourceMetaDataInfoFormatMarkPoint _value) {
        this.markPoint[i] = _value;
    }


    /**
     * Gets the inPoint value for this ResourceEntityResourceMetaDataInfoFormat.
     * 
     * @return inPoint
     */
    public java.lang.Integer getInPoint() {
        return inPoint;
    }


    /**
     * Sets the inPoint value for this ResourceEntityResourceMetaDataInfoFormat.
     * 
     * @param inPoint
     */
    public void setInPoint(java.lang.Integer inPoint) {
        this.inPoint = inPoint;
    }


    /**
     * Gets the outPoint value for this ResourceEntityResourceMetaDataInfoFormat.
     * 
     * @return outPoint
     */
    public java.lang.Integer getOutPoint() {
        return outPoint;
    }


    /**
     * Sets the outPoint value for this ResourceEntityResourceMetaDataInfoFormat.
     * 
     * @param outPoint
     */
    public void setOutPoint(java.lang.Integer outPoint) {
        this.outPoint = outPoint;
    }


    /**
     * Gets the tapeID value for this ResourceEntityResourceMetaDataInfoFormat.
     * 
     * @return tapeID
     */
    public java.lang.String getTapeID() {
        return tapeID;
    }


    /**
     * Sets the tapeID value for this ResourceEntityResourceMetaDataInfoFormat.
     * 
     * @param tapeID
     */
    public void setTapeID(java.lang.String tapeID) {
        this.tapeID = tapeID;
    }


    /**
     * Gets the tapeTrimIn value for this ResourceEntityResourceMetaDataInfoFormat.
     * 
     * @return tapeTrimIn
     */
    public java.lang.Integer getTapeTrimIn() {
        return tapeTrimIn;
    }


    /**
     * Sets the tapeTrimIn value for this ResourceEntityResourceMetaDataInfoFormat.
     * 
     * @param tapeTrimIn
     */
    public void setTapeTrimIn(java.lang.Integer tapeTrimIn) {
        this.tapeTrimIn = tapeTrimIn;
    }


    /**
     * Gets the tapeTrimOut value for this ResourceEntityResourceMetaDataInfoFormat.
     * 
     * @return tapeTrimOut
     */
    public java.lang.Integer getTapeTrimOut() {
        return tapeTrimOut;
    }


    /**
     * Sets the tapeTrimOut value for this ResourceEntityResourceMetaDataInfoFormat.
     * 
     * @param tapeTrimOut
     */
    public void setTapeTrimOut(java.lang.Integer tapeTrimOut) {
        this.tapeTrimOut = tapeTrimOut;
    }


    /**
     * Gets the markSign value for this ResourceEntityResourceMetaDataInfoFormat.
     * 
     * @return markSign
     */
    public java.lang.String getMarkSign() {
        return markSign;
    }


    /**
     * Sets the markSign value for this ResourceEntityResourceMetaDataInfoFormat.
     * 
     * @param markSign
     */
    public void setMarkSign(java.lang.String markSign) {
        this.markSign = markSign;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceEntityResourceMetaDataInfoFormat)) return false;
        ResourceEntityResourceMetaDataInfoFormat other = (ResourceEntityResourceMetaDataInfoFormat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalLength==null && other.getTotalLength()==null) || 
             (this.totalLength!=null &&
              this.totalLength.equals(other.getTotalLength()))) &&
            ((this.markPoint==null && other.getMarkPoint()==null) || 
             (this.markPoint!=null &&
              java.util.Arrays.equals(this.markPoint, other.getMarkPoint()))) &&
            ((this.inPoint==null && other.getInPoint()==null) || 
             (this.inPoint!=null &&
              this.inPoint.equals(other.getInPoint()))) &&
            ((this.outPoint==null && other.getOutPoint()==null) || 
             (this.outPoint!=null &&
              this.outPoint.equals(other.getOutPoint()))) &&
            ((this.tapeID==null && other.getTapeID()==null) || 
             (this.tapeID!=null &&
              this.tapeID.equals(other.getTapeID()))) &&
            ((this.tapeTrimIn==null && other.getTapeTrimIn()==null) || 
             (this.tapeTrimIn!=null &&
              this.tapeTrimIn.equals(other.getTapeTrimIn()))) &&
            ((this.tapeTrimOut==null && other.getTapeTrimOut()==null) || 
             (this.tapeTrimOut!=null &&
              this.tapeTrimOut.equals(other.getTapeTrimOut()))) &&
            ((this.markSign==null && other.getMarkSign()==null) || 
             (this.markSign!=null &&
              this.markSign.equals(other.getMarkSign())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTotalLength() != null) {
            _hashCode += getTotalLength().hashCode();
        }
        if (getMarkPoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarkPoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarkPoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInPoint() != null) {
            _hashCode += getInPoint().hashCode();
        }
        if (getOutPoint() != null) {
            _hashCode += getOutPoint().hashCode();
        }
        if (getTapeID() != null) {
            _hashCode += getTapeID().hashCode();
        }
        if (getTapeTrimIn() != null) {
            _hashCode += getTapeTrimIn().hashCode();
        }
        if (getTapeTrimOut() != null) {
            _hashCode += getTapeTrimOut().hashCode();
        }
        if (getMarkSign() != null) {
            _hashCode += getMarkSign().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceEntityResourceMetaDataInfoFormat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Format"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalLength");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TotalLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "MarkPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>Format>MarkPoint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "InPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "OutPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tapeID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TapeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tapeTrimIn");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TapeTrimIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tapeTrimOut");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TapeTrimOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markSign");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "MarkSign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
