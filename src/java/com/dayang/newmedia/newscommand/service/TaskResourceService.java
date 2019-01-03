package com.dayang.newmedia.newscommand.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayang.newmedia.newscommand.db.dao.TaskResourceMapper;
import com.dayang.newmedia.newscommand.db.model.TaskResource;
import com.dayang.newmedia.newscommand.db.model.TaskResourceQuery;
import com.dayang.newmedia.newscommand.db.model.TaskResourceQuery.Criteria;
import com.dayang.newmedia.newscommand.ws.commandapp.model.Resource;
@Service("taskResourceService")
public class TaskResourceService {
    @Autowired
    public TaskResourceMapper taskResourceMapper;
    
    /**
     *   根据报题id获取和该报题相关资源 
     * @param newsTaskId
     * @return
     */
    public List<Resource> getResourceByNewsTaskId(String newsTaskId){
        List<Resource> aResourceList = new ArrayList<Resource>() ;
        TaskResourceQuery example = new TaskResourceQuery();
        Criteria createCriteria = example.createCriteria() ;
        createCriteria.andTaskguidEqualTo(newsTaskId);
        List<TaskResource> aTaskResourceList = taskResourceMapper.selectByExample(example) ;
        for (Iterator iterator = aTaskResourceList.iterator(); iterator.hasNext();) {
            Resource resource = new Resource() ;
            TaskResource taskResource = (TaskResource) iterator.next();
            resource.setGuid(taskResource.getGuid());
            resource.setResourceGuid(taskResource.getResourceguid());
            resource.setTitle(taskResource.getTitle());
            resource.setResourceType(taskResource.getResourcetype());
            aResourceList.add(resource);
        }
        return aResourceList ;
    }
}
