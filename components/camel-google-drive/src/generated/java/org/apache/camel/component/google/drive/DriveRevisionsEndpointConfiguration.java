
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.drive.Drive$Revisions}.
 */
@ApiParams(apiName = "drive-revisions", description = "The revisions collection of methods",
           apiMethods = {@ApiMethod(methodName = "delete", description="Removes a revision", signatures={"com.google.api.services.drive.Drive$Revisions$Delete delete(String fileId, String revisionId)"}), @ApiMethod(methodName = "get", description="Gets a specific revision", signatures={"com.google.api.services.drive.Drive$Revisions$Get get(String fileId, String revisionId)"}), @ApiMethod(methodName = "list", description="Lists a file's revisions", signatures={"com.google.api.services.drive.Drive$Revisions$List list(String fileId)"}), @ApiMethod(methodName = "patch", description="Updates a revision", signatures={"com.google.api.services.drive.Drive$Revisions$Patch patch(String fileId, String revisionId, com.google.api.services.drive.model.Revision content)"}), @ApiMethod(methodName = "update", description="Updates a revision", signatures={"com.google.api.services.drive.Drive$Revisions$Update update(String fileId, String revisionId, com.google.api.services.drive.model.Revision content)"})}, aliases = {})
@UriParams
@Configurer
public final class DriveRevisionsEndpointConfiguration extends GoogleDriveConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "patch", description="The com.google.api.services.drive.model.Revision"), @ApiMethod(methodName = "update", description="The com.google.api.services.drive.model.Revision")})
    private com.google.api.services.drive.model.Revision content;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete", description="The ID of the file"), @ApiMethod(methodName = "get", description="The ID of the file"), @ApiMethod(methodName = "list", description="The ID of the file"), @ApiMethod(methodName = "patch", description="The ID for the file"), @ApiMethod(methodName = "update", description="The ID for the file")})
    private String fileId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete", description="The ID of the revision"), @ApiMethod(methodName = "get", description="The ID of the revision"), @ApiMethod(methodName = "patch", description="The ID for the revision"), @ApiMethod(methodName = "update", description="The ID for the revision")})
    private String revisionId;

    public com.google.api.services.drive.model.Revision getContent() {
        return content;
    }

    public void setContent(com.google.api.services.drive.model.Revision content) {
        this.content = content;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }
}