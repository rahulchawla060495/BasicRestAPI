package com.rest.webservice.restfulservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/*added for static filtering at class level*/
/*@JsonIgnoreProperties(value={"field2"})*/

/* adding filter annotation for dynamic filtering of data */
@JsonFilter(value="RestBeanFilters")
public class RestBean {
public String field1;
public String field2;
/*added for static filtering at row level*/
/*@JsonIgnore*/
public String field3;
public RestBean(String field1, String field2, String field3) {
	this.field1 = field1;
	this.field2 = field2;
	this.field3 = field3;
}
public String getField1() {
	return field1;
}
public void setField1(String field1) {
	this.field1 = field1;
}
public String getField2() {
	return field2;
}
public void setField2(String field2) {
	this.field2 = field2;
}
public String getField3() {
	return field3;
}
public void setField3(String field3) {
	this.field3 = field3;
}

}
