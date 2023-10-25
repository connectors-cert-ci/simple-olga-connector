package org.mule.extension.simple.olga.internal;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.license.RequiresEntitlement;


/**
 * This is the main class of an extension, is the entry point from which configurations, connection providers, operations
 * and sources are going to be declared.
 */
@Xml(prefix = "simple-olga")
@Extension(name = "Simple-olga-")
@Configurations(SimpleolgaConfiguration.class)
@RequiresEntitlement(name="Simple-olga-")
public class SimpleolgaExtension {

}