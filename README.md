# CSG REST Interface

This interface consuming SOAP based web services
1. EAI
2. SOA OSB

And, Exposed them as an REST web services. 

## EAI SOAP Web Services

EAI SOAP web services exposed on top of CSG. This interface limits the number of calls to EAI SOAP Web Services by caching the responses.

User are allowed to call 100 different operations in an hour.

Below services of EAI SOAP Web Services are wrapped with CSG REST Interface.

1. https://ebs-prd.corp.chartercom.com/csg/2.06/EquipmentService.asmx
2. https://ebs-prd.corp.chartercom.com/csg/2.06/AccountService.asmx
3. https://ebs-prd.corp.chartercom.com/csg/2.06/ServicesService.asmx

## SOA OSB

SOA OSB is exposed to get user account details. No caching is implemented for SOA OSB SOAP Web Services.

Below services of SOA OSB SOAP Web Services are wrapped with CSG REST Interface.

1. https://esbauth.corp.chartercom.com:11102/QueryIdentity/proxy/PS_QueryIdentity_v1r0
2. https://esbauth.corp.chartercom.com:11102/UpdateIdentity/proxy/PS_UpdateIdentity_v1r0