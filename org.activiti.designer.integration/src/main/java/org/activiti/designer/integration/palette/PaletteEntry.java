/**
 * 
 */
package org.activiti.designer.integration.palette;

/**
 * Entries in the default palette.
 * 
 * @author Tiese Barrell
 * @since 0.5.1
 * @version 1
 * 
 */
public enum PaletteEntry {

	ALL, START_EVENT, TIMER_START_EVENT, MESSAGE_START_EVENT, ERROR_START_EVENT, SIGNAL_START_EVENT, ALFRESCO_START_EVENT, END_EVENT, ERROR_END_EVENT, TERMINATE_END_EVENT,
	EXCLUSIVE_GATEWAY, INCLUSIVE_GATEWAY, EVENT_GATEWAY, MAIL_TASK, MANUAL_TASK, 
	RECEIVE_TASK, PARALLEL_GATEWAY, SCRIPT_TASK, SERVICE_TASK, SEND_TASK, CALL_ACTIVITY, SUBPROCESS, POOL, LANE, EVENT_SUBPROCESS,
	USER_TASK, ALFRESCO_USER_TASK, BOUNDARY_TIMER, BOUNDARY_ERROR, BOUNDARY_MESSAGE, BOUNDARY_SIGNAL, CATCH_TIMER, CATCH_SIGNAL, CATCH_MESSAGE, 
	THROW_SIGNAL, THROW_NONE, TEXT_ANNOTATION, BUSINESSRULE_TASK, ALFRESCO_SCRIPT_TASK, ALFRESCO_MAIL_TASK;

}
