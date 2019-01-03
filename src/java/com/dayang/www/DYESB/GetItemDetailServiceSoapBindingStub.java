/**
 * GetItemDetailServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dayang.www.DYESB;

public class GetItemDetailServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.dayang.www.DYESB.GetItemDetailPort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getItemDetail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getItemDetailInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("MREML", "MREML"), MREML_pkg.MREML.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("MREML", "MREML"));
        oper.setReturnClass(MREML_pkg.MREML.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getItemDetailOutput"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GetServiceInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dayang.com/ESB/schema/Monitor/0.1", "GetServiceInfoRequestType"), com.dayang.www.ESB.schema.Monitor._0_1.GetServiceInfoRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dayang.com/ESB/schema/Monitor/0.1", "GetServiceInfoResponseType"));
        oper.setReturnClass(com.dayang.www.ESB.schema.Monitor._0_1.GetServiceInfoResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GetServiceInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

    }

    public GetItemDetailServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public GetItemDetailServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public GetItemDetailServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.dayang.com/DYESB", "ArrayOf_tns1_ChannelType");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ChannelType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("MREML", "ChannelType");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.dayang.com/DYESB", "ArrayOf_tns1_ProcessType");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ProcessType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("MREML", "ProcessType");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.dayang.com/ESB/schema/Monitor/0.1", "GetServiceInfoRequestType");
            cachedSerQNames.add(qName);
            cls = com.dayang.www.ESB.schema.Monitor._0_1.GetServiceInfoRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dayang.com/ESB/schema/Monitor/0.1", "GetServiceInfoResponseType");
            cachedSerQNames.add(qName);
            cls = com.dayang.www.ESB.schema.Monitor._0_1.GetServiceInfoResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryRequest>AdvanceCondtion>AttributeCondition");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryRequest>BasicCondition>Title");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicConditionTitle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>>MREML>MREML>RequestEntity>RequestExtendMSG>AddTCCopyTaskRequest>LogoInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryRequest>AdvanceCondtion");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestAdvanceCondtion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryRequest>BasicCondition");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryRequest>Limitation");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestLimitation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>>MREML>MREML>ResponseEntity>ResponseExtendMSG>QueryULBaseData>ClipElementGroupInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>>MREML>MREML>ResponseEntity>ResponseExtendMSG>QueryULBaseData>SignalSourceGroupInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceGroupInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>>MREML>MREML>ResponseEntity>ResponseExtendMSG>QueryULBaseData>SignalSourceInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>>MREML>MREML>ResponseEntity>ResponseExtendMSG>QueryULBaseData>TapeTypeGroupInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>>MREML>MREML>ResponseEntity>ResponseExtendMSG>QueryULBaseData>TapeTypeInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>>MREML>MREML>ResponseEntity>ResponseExtendMSG>QueryULBaseData>TaskClassInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>RequestEntity>RequestExtendMSG>AddTCCopyTaskRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>RequestEntity>RequestExtendMSG>AddULTaskRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGAddULTaskRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>RequestEntity>RequestExtendMSG>DeleteTaskRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGDeleteTaskRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>RequestEntity>RequestExtendMSG>ImportRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGImportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryBCListRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGQueryBCListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryProcessesRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGQueryProcessesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryProcessStatusRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGQueryProcessStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGQueryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryTaskRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGQueryTaskRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryULTaskRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGQueryULTaskRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryValidateRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGQueryValidateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>RequestEntity>RequestExtendMSG>UpdateULTaskRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSGUpdateULTaskRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>ResponseEntity>ResponseExtendMSG>QueryProcessStatusResponse");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>ResponseEntity>ResponseExtendMSG>QueryResponse");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>ResponseEntity>ResponseExtendMSG>QueryTaskResponse");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryTaskResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>ResponseEntity>ResponseExtendMSG>QueryULBaseData");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ElementEntity>ElementMetadata>AVFormat>AudioInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ElementEntityElementMetadataAVFormatAudioInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ElementEntity>ElementMetadata>AVFormat>VideoInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ElementEntityElementMetadataAVFormatVideoInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ElementEntity>ElementMetadata>StorageInfo>FTPMode");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ElementEntityElementMetadataStorageInfoFTPMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ElementEntity>ElementMetadata>StorageInfo>UNCMode");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ElementEntityElementMetadataStorageInfoUNCMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>MREML>MREML>EnvelopEntity>Router");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLEnvelopEntityRouter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>MREML>MREML>RequestEntity>RequestExtendMSG");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntityRequestExtendMSG.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>MREML>MREML>ResponseEntity>ResourceStatus");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLResponseEntityResourceStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>MREML>MREML>ResponseEntity>ResponseExtendMSG");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSG.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>Description>Column");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ResourceEntityResourceMetaDataInfoDescriptionColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>Description>KeyFrameInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>Description>SceneDescription");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ResourceEntityResourceMetaDataInfoDescriptionSceneDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>Format>MarkPoint");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ResourceEntityResourceMetaDataInfoFormatMarkPoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>Subject>Class");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ResourceEntityResourceMetaDataInfoSubjectClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>ElementEntity>ElementMetadata>AVFormat");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ElementEntityElementMetadataAVFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>ElementEntity>ElementMetadata>MediaInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ElementEntityElementMetadataMediaInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>ElementEntity>ElementMetadata>StorageInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ElementEntityElementMetadataStorageInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>MREML>MREML>EMIEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLEMIEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>MREML>MREML>EnvelopEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLEnvelopEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>MREML>MREML>NotifyEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLNotifyEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>MREML>MREML>RequestEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLRequestEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>MREML>MREML>ResponseEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREMLResponseEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>AuthorizeDescription");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ResourceEntityResourceMetaDataInfoAuthorizeDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Date");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ResourceEntityResourceMetaDataInfoDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Description");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ResourceEntityResourceMetaDataInfoDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Format");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ResourceEntityResourceMetaDataInfoFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Relations");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ResourceEntityResourceMetaDataInfoRelations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>ResourceID");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ResourceEntityResourceMetaDataInfoResourceID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Responsibility");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ResourceEntityResourceMetaDataInfoResponsibility.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Source");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ResourceEntityResourceMetaDataInfoSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Subject");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ResourceEntityResourceMetaDataInfoSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Title");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ResourceEntityResourceMetaDataInfoTitle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">BroadcastListItemType>ClipItem");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.BroadcastListItemTypeClipItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">ChannelType>Signal");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ChannelTypeSignal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">ElementEntity>ElementMetadata");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ElementEntityElementMetadata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">FileEntity>AudioCHInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.FileEntityAudioCHInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">FileEntity>CGInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.FileEntityCGInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">FileEntity>FileInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.FileEntityFileInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">MREML>MREML");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREMLMREML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">NewsListEntity>NewsListItem");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.NewsListEntityNewsListItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">ResourceEntity>ExportTargetInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ResourceEntityExportTargetInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">ResourceEntity>ResourceMetaDataInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ResourceEntityResourceMetaDataInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "AuditInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.AuditInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "BroadcastListEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.BroadcastListEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "BroadcastListItemType");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.BroadcastListItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "ChannelType");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ChannelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "ElementEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ElementEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "ExtendAttrGrp");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ExtendAttrGrp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "ExtendAttribute");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ExtendAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "FileEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.FileEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "MREML");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.MREML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "NewsListEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.NewsListEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "ProcessType");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ProcessType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "QueryULTaskResponseType");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.QueryULTaskResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "ResourceEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ResourceEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "ULTaskInfoType");
            cachedSerQNames.add(qName);
            cls = MREML_pkg.ULTaskInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public MREML_pkg.MREML getItemDetail(MREML_pkg.MREML getItemDetailInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getItemDetail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.dayang.com/DYESB", "getItemDetail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getItemDetailInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (MREML_pkg.MREML) _resp;
            } catch (java.lang.Exception _exception) {
                return (MREML_pkg.MREML) org.apache.axis.utils.JavaUtils.convert(_resp, MREML_pkg.MREML.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.dayang.www.ESB.schema.Monitor._0_1.GetServiceInfoResponseType getServiceInfo(com.dayang.www.ESB.schema.Monitor._0_1.GetServiceInfoRequestType getServiceInfoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getServiceInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.dayang.com/DYESB", "getServiceInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getServiceInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.dayang.www.ESB.schema.Monitor._0_1.GetServiceInfoResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.dayang.www.ESB.schema.Monitor._0_1.GetServiceInfoResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.dayang.www.ESB.schema.Monitor._0_1.GetServiceInfoResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
