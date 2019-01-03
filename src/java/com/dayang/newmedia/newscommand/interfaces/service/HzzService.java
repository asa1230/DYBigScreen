package com.dayang.newmedia.newscommand.interfaces.service;

import java.rmi.RemoteException;
import java.util.UUID;

import javax.xml.rpc.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dayang.www.DYESB.GetItemDetailServiceLocator;
import com.dayang.www.DYESB.GetItemDetailServiceSoapBindingStub;

import MREML_pkg.ExtendAttribute;
import MREML_pkg.MREML;
import MREML_pkg.MREMLMREML;
import MREML_pkg.MREMLMREMLEnvelopEntity;
import MREML_pkg.ResourceEntity;
import MREML_pkg.ResourceEntityResourceMetaDataInfo;
import MREML_pkg.ResourceEntityResourceMetaDataInfoDescription;
import MREML_pkg.ResourceEntityResourceMetaDataInfoDescriptionColumn;
import net.sf.json.JSONObject;

@Service
public class HzzService {
	private Logger log = LoggerFactory.getLogger(HzzService.class);

	@Value(value="${HZ.mamwebservice.getitemdetailUrl}")
	private String mamwebserviceGetDetailUrl;
	
	public JSONObject getItemDetail(String uniqueId) {
		log.debug("uniqueIds"+uniqueId);
			JSONObject jsonObject = new JSONObject();
		
		GetItemDetailServiceLocator glocator = new GetItemDetailServiceLocator();
		GetItemDetailServiceSoapBindingStub query2=null;
			try {
				glocator.setEndpointAddress("GetItemDetailService", mamwebserviceGetDetailUrl);
			 query2=(GetItemDetailServiceSoapBindingStub)glocator.getPort(GetItemDetailServiceSoapBindingStub.class);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
			MREML_pkg.MREMLMREMLEnvelopEntity envelopEntity = new MREML_pkg.MREMLMREMLEnvelopEntity();
			envelopEntity.setEnvelopVersion("1.0.2R");
			envelopEntity.setSendFrom("DYBC");	
			String[] a = new String[1];
			a[0] = "DYMAM";
			envelopEntity.setSendTo(a);
			MREML_pkg.ResourceEntityResourceMetaDataInfoResourceID resourceID=new MREML_pkg.ResourceEntityResourceMetaDataInfoResourceID();
			resourceID.setResourceUniqueID(uniqueId);
			MREML_pkg.ResourceEntityResourceMetaDataInfoTitle title=new MREML_pkg.ResourceEntityResourceMetaDataInfoTitle();
			title.setResourceName("");
			MREML_pkg.ResourceEntityResourceMetaDataInfo resourceMetaDataInfo=new MREML_pkg.ResourceEntityResourceMetaDataInfo();
			resourceMetaDataInfo.setResourceID(resourceID);
			resourceMetaDataInfo.setTitle(title);
			//getmetadata ����
			ExtendAttribute attribute = new MREML_pkg.ExtendAttribute();
			attribute.setAttributeName("getMetadata");
			attribute.setAttributeValue("true");
			ExtendAttribute[] attributes=new ExtendAttribute[1];
			attributes[0]=attribute;
			resourceMetaDataInfo.setExtendAttribute(attributes);
			ResourceEntity resourceEntity = new ResourceEntity();
			resourceEntity.setResourceMetaDataInfo(resourceMetaDataInfo);
			ResourceEntity[] resourceEntityGrp=new ResourceEntity[1];
			resourceEntityGrp[0]=resourceEntity;
			MREML_pkg.MREMLMREMLRequestEntity requestEntity=new MREML_pkg.MREMLMREMLRequestEntity();
			requestEntity.setAction("GetItemDetail");
			UUID randomUUID = UUID.randomUUID();
			requestEntity.setRequestEntityID(randomUUID.toString());
			
			MREML_pkg.MREMLMREML submreml=new MREML_pkg.MREMLMREML();
			submreml.setEnvelopEntity(envelopEntity);
			submreml.setResourceEntity(resourceEntityGrp);
			submreml.setRequestEntity(requestEntity);
			
			MREML mreml = new MREML();
			
			mreml.setMREML(submreml);
			
			try {
				MREML itemDetail = query2.getItemDetail(mreml);
				MREMLMREML mreml2 = itemDetail.getMREML();
				ResourceEntity[] entity = mreml2.getResourceEntity();
				if(entity!=null) {
					System.out.println("entit不为空");
					for (ResourceEntity resourceEntity2 : entity) {
						ResourceEntityResourceMetaDataInfo dataInfo = resourceEntity2.getResourceMetaDataInfo();
						if(dataInfo!=null) {
							ResourceEntityResourceMetaDataInfoDescription description = dataInfo.getDescription();
							if(description!=null) {
								String channelName = description.getChannelName();
								if(channelName!=null) {
									System.out.println("channelName"+channelName);
									jsonObject.put("channelName", channelName);
								}
								ResourceEntityResourceMetaDataInfoDescriptionColumn column = description.getColumn(0);
								if(column!=null) {
									String columnName = column.getColumnName();
									if(columnName!=null) {
										System.out.println("columnName"+columnName);
										jsonObject.put("columnName", columnName);
									}
								}
							}else {
								jsonObject.put("columnName", "");
								jsonObject.put("channelName", "");
							}
						}
						
					}
				}else {
					jsonObject.put("columnName", "");
					jsonObject.put("channelName", "");
				}
				return jsonObject;
				
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			log.debug("uniqueIde"+uniqueId);
			return jsonObject;
			
			
	
		
		
	}
	
	
}
