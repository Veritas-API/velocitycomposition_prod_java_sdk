
# Sandbox

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeShareClientIps** | **List&lt;String&gt;** | A set of IP addresses of machines that are actively using this share. |  [optional]
**applicationHosts** | [**List&lt;ApplicationHostInfo&gt;**](ApplicationHostInfo.md) | For automation releases, added a list of application hosts along with their URI&#39;s |  [optional]
**applicationInstance** | [**ApplicationInstance**](ApplicationInstance.md) |  |  [optional]
**copyPreparation** | **Boolean** | Flag which indicate Copy Preparation is enabled or not |  [optional]
**creationTime** | **Long** | Sandbox creation time | 
**description** | **String** | Short description of the sandbox |  [optional]
**expiryTime** | **Long** | Sandbox expiry time | 
**id** | **String** | A unique identifier of the sandbox object | 
**mounts** | [**List&lt;Mount&gt;**](Mount.md) |  |  [optional]
**name** | **String** | Name of the sandbox | 
**owner** | [**User**](User.md) |  |  [optional]
**pointInTimeCreationTime** | **Long** | Time the point-in-time this sandbox is based on was created | 
**pointInTimeId** | **String** | Id of pointInTime for which this sandbox was created | 
**properties** | [**HashMapstringobject**](HashMapstringobject.md) | Sandbox properties. To be used for any type specific sandbox properties |  [optional]
**sandboxConfig** | [**SandboxConfig**](SandboxConfig.md) |  |  [optional]
**shareLocation** | [**ShareLocation**](ShareLocation.md) |  |  [optional]
**sharesOpStateUpdateBatchTime** | **Long** |  |  [optional]
**state** | **String** | Current state of the sandbox | 
**statusInfo** | [**StatusInfo**](StatusInfo.md) | More info about the state of the share and why it is in the state it is in |  [optional]
**storageServerId** | **String** | A unique identifier of the storage server hosting the sandbox | 
**storageServerRecordId** | **String** | storage server supplied unique recordId for this sandbox | 
**targetHosts** | **List&lt;String&gt;** | a list of application hosts for the sandbox |  [optional]
**type** | **String** | The type of sandbox. | 
**workloadId** | **String** | Id of workload for which this sandbox was created | 



