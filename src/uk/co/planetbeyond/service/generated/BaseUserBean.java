




// ______________________________________________________
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: com.mysql.jdbc.Driver
//
// Author: Javed Kansi
// ______________________________________________________

package uk.co.planetbeyond.service.generated;

import java.io.Serializable;
import com.sleepycat.persist.model.Persistent;
import org.apache.commons.lang.builder.EqualsBuilder;

import uk.co.planetbeyond.service.manager.UserManagerImpl;

/**
 * UserBean is a mapping of user Table.
 * @author sql2java
*/
@Persistent
public class BaseUserBean extends BaseGeneratedBean implements Serializable
{
	private static final long serialVersionUID = 4013363763417733596L;
	
    protected Integer callDuration;
    protected Integer callAction;
    protected Integer reponseStatus;
    protected Integer subscriptionStatus;
    protected String msisdn;

    /**
     * Prefered methods to create a UserBean is via the createUserBean method in UserManager or
     * via the factory class UserFactory create method
     */
    public BaseUserBean()
    {
    }

    /**
     * Getter method for callDuration.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: user.call_duration</li>
     * <li>comments: call duration is in seconds</li>
     * <li>column size: 10</li>
     * <li>jdbc type returned by the driver: Types.INTEGER</li>
     * </ul>
     *
     * @return the value of callDuration
     */
    public Integer getCallDuration()
    {
        return callDuration;
    }

    /**
     * Setter method for callDuration.
     * <br>
     *
     * @param newVal the new value to be assigned to callDuration
     */
    public void setCallDuration(Integer newVal)
    {
        callDuration = newVal;
    }

    /**
     * Getter method for callAction.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: user.call_action</li>
     * <li>comments: call action is actually iput of user during call (DTMF)</li>
     * <li>column size: 3</li>
     * <li>jdbc type returned by the driver: Types.TINYINT</li>
     * </ul>
     *
     * @return the value of callAction
     */
    public Integer getCallAction()
    {
        return callAction;
    }

    /**
     * Setter method for callAction.
     * <br>
     *
     * @param newVal the new value to be assigned to callAction
     */
    public void setCallAction(Integer newVal)
    {
        callAction = newVal;
    }

    /**
     * Getter method for reponseStatus.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: user.reponse_status</li>
     * <li>comments: 1-No response
2-Hangup
3-Answered</li>
     * <li>column size: 3</li>
     * <li>jdbc type returned by the driver: Types.TINYINT</li>
     * </ul>
     *
     * @return the value of reponseStatus
     */
    public Integer getReponseStatus()
    {
        return reponseStatus;
    }

    /**
     * Setter method for reponseStatus.
     * <br>
     *
     * @param newVal the new value to be assigned to reponseStatus
     */
    public void setReponseStatus(Integer newVal)
    {
        reponseStatus = newVal;
    }

    /**
     * Getter method for subscriptionStatus.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: user.subscription_status</li>
     * <li>comments: 0-Unsubscribed
1-Subscribed</li>
     * <li>column size: 3</li>
     * <li>jdbc type returned by the driver: Types.TINYINT</li>
     * </ul>
     *
     * @return the value of subscriptionStatus
     */
    public Integer getSubscriptionStatus()
    {
        return subscriptionStatus;
    }

    /**
     * Setter method for subscriptionStatus.
     * <br>
     *
     * @param newVal the new value to be assigned to subscriptionStatus
     */
    public void setSubscriptionStatus(Integer newVal)
    {
        subscriptionStatus = newVal;
    }

    /**
     * Getter method for msisdn.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: user.msisdn</li>
     * <li>column size: 15</li>
     * <li>jdbc type returned by the driver: Types.VARCHAR</li>
     * </ul>
     *
     * @return the value of msisdn
     */
    public String getMsisdn()
    {
        return msisdn;
    }

    /**
     * Setter method for msisdn.
     * <br>
     *
     * @param newVal the new value to be assigned to msisdn
     */
    public void setMsisdn(String newVal)
    {
        msisdn = newVal;
    }


    /**
     * Copies the passed bean into the current bean.
     *
     * @param bean the bean to copy into the current bean
     */
    public void copy(BaseUserBean bean)
    {
        setCallDuration(bean.getCallDuration());
        setCallAction(bean.getCallAction());
        setReponseStatus(bean.getReponseStatus());
        setSubscriptionStatus(bean.getSubscriptionStatus());
        setMsisdn(bean.getMsisdn());
    }

    /**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object)
	{
		if (!(object instanceof BaseUserBean)) {
			return false;
		}

		BaseUserBean obj = (BaseUserBean) object;
		return new EqualsBuilder()
            .append(getCallDuration(), obj.getCallDuration())
            .append(getCallAction(), obj.getCallAction())
            .append(getReponseStatus(), obj.getReponseStatus())
            .append(getSubscriptionStatus(), obj.getSubscriptionStatus())
            .append(getMsisdn(), obj.getMsisdn())
            .isEquals();
	}


    /**
     * Converts the current object to full form of the bean which includes all utility methods as well
     */
    public UserBean toManagedBean()
    {
	UserBean bean = UserManagerImpl.getInstance().createUserBean();
        bean.setCallDuration(getCallDuration());
        bean.setCallAction(getCallAction());
        bean.setReponseStatus(getReponseStatus());
        bean.setSubscriptionStatus(getSubscriptionStatus());
        bean.setMsisdn(getMsisdn());
	return bean;
    }
}
