package alfresco.s.api.login.models;

import com.google.gson.annotations.SerializedName;

public class Item {

        private String nodeRef;
        private String nodeType;
        private int priority;

        @SerializedName("cm:modified")
        private String cmModified;
        private String cmModified2;
        private String cmModified3;

        public void setNodeRef(String nodeRef){
            this.nodeRef = nodeRef;
        }

        public String getNodeRef(){
            return nodeRef;
        }

        public void setNodeType(String nodeType){
            this.nodeType = nodeType;
        }

        public String getNodeType(){
            return nodeType;
        }

        public void setPriority(int priority){
            this.priority = priority;
        }

        public int getPriority(){
            return priority;
        }

        public void setCmModified(String cmModified){
            this.cmModified = cmModified;
        }

        public String getCmModified(){
            return cmModified;
        }

        @Override
        public String toString(){
            return
                    "ItemsItem{" +
                            "nodeRef = '" + nodeRef + '\'' +
                            ",nodeType = '" + nodeType + '\'' +
                            ",priority = '" + priority + '\'' +
                            ",cm:modified = '" + cmModified + '\'' +
                            "}";
        }
}
