# Clean code acyclic dependency principle

## Requirements
* Using Intellij 2020.2 Community
* Install plugin "Metrics reloaded"
 
##  Correct Cyclic Dependencies (package...)
* Identify cycles: In IDE click on Analyze -> Cyclic Dependencies?
* How can you correct it?
* Check cycle has disappeared

 ##  Using coupling metrics
1. First mesure
   1. Click on Analyze => Calculate Metrics, Select "Martin packaging metrics" in Metrics Profile, Then click on "Ok"
   1. Check the metrics make sense to you... Then click on "Create a Snapshot", save as "snapshot1"
1. Insert an Internal Service wichin package B
   1. Create a ServiceB2Impl in package B, with a doB2 service method
   1. Create a doB_2() method in ServiceBImpl that calls ServiceB2Impl 
   1. Check the metrics, doest it make sense to you? Then click on "Create a Snapshot", save as "snapshot2" and compare with previous snapshot:  does it make sense? is it important?
1. Insert an additional Service call between package B and C
   1. create an emmpty doC_2() in ServiceC
   1. create a doB2_2() method in ServiceB2 that calls ServiceC.doC_2
   1. Check the metrics, doest it make sense to you? Then click on "Create a Snapshot", save as "snapshot3" and compare with previous snapshot
1. Insert an additional ServiceC2 and a call betweeen ServiceB2 and ServiceC2:
   1. create a ServiceC2 with a method doC2
   1. create a doB2_3() method in ServiceB2 calling ServiceC2?doC2()
   1. Check the metrics, doest it make sense to you? Then click on "Create a Snapshot", save as "snapshot4" and compare with previous snapshot
1. What's is globally happening, which metrics is declining?
## Improving Dependency injection
1. Introduce Interface for ServiceD
   1. Click on ServiceDImpl, then type Shift+F6 (Right Click -> Refactor Rename) type ServiceD, then click on Refactor
   1. Click on ServiceD, then Right click on Refactor-> Extract Interface
   1. Change interface name frm ServiceC2Impl to ServiceD, select toggle "Rename original class and use interface where possible"
   1. Check the metrics, doest it make sense to you? Then click on "Create a Snapshot", save as "snapshot5" and compare with previous snapshot
   1. Create package package_d.impl
   1. Move ServiceDImpl to pavckage_d.impl
   1. Check the metrics, doest it make sense to you? Then click on "Create a Snapshot", save as "snapshot6" and compare with previous snapshot
   1. Which package should you refactor?
1. Perform previous refactoring to get optimal metrics on all concerned packkages
   1. Check the metrics, doest it make sense to you? Then click on "Create a Snapshot", save as "snapshot7" and compare with previous snapshot
  

Step|What
---|---
0|init
1|removed cyclic dependecy
2|introduced internal service in package B
3|an additional Service call between package B and C
4|additional ServiceC2 and a call betweeen ServiceB2 and ServiceC2
5|introduce interface for Service D
6|introduced abstractions for package_b and package_c                                                                                                                                                     
