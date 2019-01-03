/**
 * QueryBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dayang.www.DYESB;

public class QueryBindingStub extends org.apache.axis.client.Stub implements com.dayang.www.DYESB.QueryPort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("query");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("MREML", "MREML"), MREML_pkq.MREML.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("MREML", "MREML"));
        oper.setReturnClass(MREML_pkq.MREML.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "queryOutput"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public QueryBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public QueryBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public QueryBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("MREML", ">>>>>RequestEntity>RequestExtendMSG>QueryRequest>AdvanceCondtion>AttributeCondition");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>>RequestEntity>RequestExtendMSG>QueryRequest>BasicCondition>Title");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntityRequestExtendMSGQueryRequestBasicConditionTitle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>ElementEntity>ElementMetadata>AVFormat>AudioInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ElementEntityElementMetadataAVFormatAudioInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>ElementEntity>ElementMetadata>AVFormat>VideoInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ElementEntityElementMetadataAVFormatVideoInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>ElementEntity>ElementMetadata>StorageInfo>FTPMode");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ElementEntityElementMetadataStorageInfoFTPMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>ElementEntity>ElementMetadata>StorageInfo>UNCMode");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ElementEntityElementMetadataStorageInfoUNCMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>RequestEntity>RequestExtendMSG>AddTCCopyTaskRequest>LogoInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>RequestEntity>RequestExtendMSG>QueryRequest>AdvanceCondtion");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntityRequestExtendMSGQueryRequestAdvanceCondtion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>RequestEntity>RequestExtendMSG>QueryRequest>BasicCondition");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntityRequestExtendMSGQueryRequestBasicCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>RequestEntity>RequestExtendMSG>QueryRequest>Limitation");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntityRequestExtendMSGQueryRequestLimitation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>ResourceEntity>ResourceMetaDataInfo>Description>Column");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>ResourceEntity>ResourceMetaDataInfo>Description>KeyFrameInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>ResourceEntity>ResourceMetaDataInfo>Description>SceneDescription");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionSceneDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>ResourceEntity>ResourceMetaDataInfo>Format>MarkPoint");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResourceEntityResourceMetaDataInfoFormatMarkPoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>ResourceEntity>ResourceMetaDataInfo>Subject>Class");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResourceEntityResourceMetaDataInfoSubjectClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>ResponseEntity>ResponseExtendMSG>QueryULBaseData>ClipElementGroupInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>ResponseEntity>ResponseExtendMSG>QueryULBaseData>SignalSourceGroupInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceGroupInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>ResponseEntity>ResponseExtendMSG>QueryULBaseData>SignalSourceInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>ResponseEntity>ResponseExtendMSG>QueryULBaseData>TapeTypeGroupInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>ResponseEntity>ResponseExtendMSG>QueryULBaseData>TapeTypeInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>>ResponseEntity>ResponseExtendMSG>QueryULBaseData>TaskClassInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ElementEntity>ElementMetadata>AVFormat");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ElementEntityElementMetadataAVFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ElementEntity>ElementMetadata>MediaInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ElementEntityElementMetadataMediaInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ElementEntity>ElementMetadata>StorageInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ElementEntityElementMetadataStorageInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>AddTCCopyTaskRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntityRequestExtendMSGAddTCCopyTaskRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>AddULTaskRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntityRequestExtendMSGAddULTaskRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>DeleteTaskRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntityRequestExtendMSGDeleteTaskRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>ImportRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntityRequestExtendMSGImportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>QueryBCListRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntityRequestExtendMSGQueryBCListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>QueryProcessesRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntityRequestExtendMSGQueryProcessesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>QueryProcessStatusRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntityRequestExtendMSGQueryProcessStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>QueryRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntityRequestExtendMSGQueryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>QueryTaskRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntityRequestExtendMSGQueryTaskRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>QueryULTaskRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntityRequestExtendMSGQueryULTaskRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>QueryValidateRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntityRequestExtendMSGQueryValidateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>UpdateULTaskRequest");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntityRequestExtendMSGUpdateULTaskRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>AuthorizeDescription");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResourceEntityResourceMetaDataInfoAuthorizeDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>Date");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResourceEntityResourceMetaDataInfoDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>Description");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResourceEntityResourceMetaDataInfoDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>Format");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResourceEntityResourceMetaDataInfoFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>Relations");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResourceEntityResourceMetaDataInfoRelations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>ResourceID");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResourceEntityResourceMetaDataInfoResourceID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>Responsibility");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResourceEntityResourceMetaDataInfoResponsibility.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>Source");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResourceEntityResourceMetaDataInfoSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>Subject");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResourceEntityResourceMetaDataInfoSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>Title");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResourceEntityResourceMetaDataInfoTitle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ResponseEntity>ResponseExtendMSG>QueryProcessStatusResponse");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResponseEntityResponseExtendMSGQueryProcessStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ResponseEntity>ResponseExtendMSG>QueryResponse");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResponseEntityResponseExtendMSGQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ResponseEntity>ResponseExtendMSG>QueryTaskResponse");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResponseEntityResponseExtendMSGQueryTaskResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>>ResponseEntity>ResponseExtendMSG>QueryULBaseData");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>ElementEntity>ElementMetadata");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ElementEntityElementMetadata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>EnvelopEntity>Router");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.EnvelopEntityRouter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>FileEntity>AudioCHInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.FileEntityAudioCHInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>FileEntity>CGInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.FileEntityCGInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>FileEntity>FileInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.FileEntityFileInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>NewsListEntity>NewsListItem");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.NewsListEntityNewsListItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>RequestEntity>RequestExtendMSG");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntityRequestExtendMSG.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ExportTargetInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResourceEntityExportTargetInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResourceEntityResourceMetaDataInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>ResponseEntity>ResourceStatus");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResponseEntityResourceStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">>ResponseEntity>ResponseExtendMSG");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResponseEntityResponseExtendMSG.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">AuditInfo");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.AuditInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">BroadcastListEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.BroadcastListEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">BroadcastListItemType>ClipItem");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.BroadcastListItemTypeClipItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">ChannelType>Signal");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ChannelTypeSignal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">ElementEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ElementEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">EMIEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.EMIEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">EnvelopEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.EnvelopEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">ExtendAttribute");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ExtendAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">FileEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.FileEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">MREML");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.MREMLType0.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">NewsListEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.NewsListEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">NotifyEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.NotifyEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">RequestEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.RequestEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">ResourceEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResourceEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", ">ResponseEntity");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ResponseEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "BroadcastListItemType");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.BroadcastListItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "ChannelType");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ChannelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "GetBCConfigResponseType");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ChannelType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("MREML", "ChannelType");
            qName2 = new javax.xml.namespace.QName("MREML", "Channel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("MREML", "MREML");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.MREML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "ProcessType");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ProcessType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "QueryProcessesResponseType");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ProcessType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("MREML", "ProcessType");
            qName2 = new javax.xml.namespace.QName("MREML", "Process");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("MREML", "QueryULTaskResponseType");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.QueryULTaskResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("MREML", "ULTaskInfoType");
            cachedSerQNames.add(qName);
            cls = MREML_pkq.ULTaskInfoType.class;
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

    public MREML_pkq.MREML query(MREML_pkq.MREML queryInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("query");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.dayang.com/DYESB", "query"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (MREML_pkq.MREML) _resp;
            } catch (java.lang.Exception _exception) {
                return (MREML_pkq.MREML) org.apache.axis.utils.JavaUtils.convert(_resp, MREML_pkq.MREML.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
