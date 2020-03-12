




// ______________________________________________________
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: com.mysql.jdbc.Driver
//
// Author: Javed Kansi
// ______________________________________________________

package uk.co.planetbeyond.service.generated;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import uk.co.planetbeyond.service.manager.UserManagerImpl;
import uk.co.planetbeyond.service.generated.GeneratedBean;





import uk.co.planetbeyond.service.generated.exception.DAOException;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.sleepycat.persist.model.Persistent;

/**
 * UserBean is a mapping of user Table.
 * @author sql2java
*/
@Persistent
public class UserBean extends BaseUserBean implements Serializable, GeneratedBean, JoinHelperInterface
{
	private static final long serialVersionUID = 7126826189280479462L;
	
    private boolean callDurationIsModified = false;
    private boolean callDurationIsInitialized = false;

    private boolean callActionIsModified = false;
    private boolean callActionIsInitialized = false;

    private boolean reponseStatusIsModified = false;
    private boolean reponseStatusIsInitialized = false;

    private boolean subscriptionStatusIsModified = false;
    private boolean subscriptionStatusIsInitialized = false;

    private boolean msisdnIsModified = false;
    private boolean msisdnIsInitialized = false;

    private boolean _isNew = true;

    /**
     * Prefered methods to create a UserBean is via the createUserBean method in UserManager or
     * via the factory class UserFactory create method
     */
    public UserBean()
    {
    }



    /**
     * Setter method for callDuration.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to callDuration
     */
    @Override
    public void setCallDuration(Integer newVal)
    {
        if ((newVal != null && callDuration != null && (newVal.compareTo(callDuration) == 0)) ||
            (newVal == null && callDuration == null && callDurationIsInitialized)) {
            return;
        }
        callDuration = newVal;
        callDurationIsModified = true;
        callDurationIsInitialized = true;
    }

    /**
     * Setter method for callDuration.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to callDuration
     */
    public void setCallDuration(int newVal)
    {
        setCallDuration(new Integer(newVal));
    }

    /**
     * Determines if the callDuration has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isCallDurationModified()
    {
        return callDurationIsModified;
    }

    /**
     * Manually set whether callDuration has been modified or not.
     */
    public void isCallDurationModified(boolean value)
    {
        callDurationIsModified = value;
    }	

    /**
     * Determines if the callDuration has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isCallDurationInitialized()
    {
        return callDurationIsInitialized;
    }

    /**
     * Manually set whether callDuration has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isCallDurationInitialized(boolean value)
    {
        callDurationIsInitialized = value;
    }



    /**
     * Setter method for callAction.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to callAction
     */
    @Override
    public void setCallAction(Integer newVal)
    {
        if ((newVal != null && callAction != null && (newVal.compareTo(callAction) == 0)) ||
            (newVal == null && callAction == null && callActionIsInitialized)) {
            return;
        }
        callAction = newVal;
        callActionIsModified = true;
        callActionIsInitialized = true;
    }

    /**
     * Setter method for callAction.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to callAction
     */
    public void setCallAction(int newVal)
    {
        setCallAction(new Integer(newVal));
    }

    /**
     * Determines if the callAction has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isCallActionModified()
    {
        return callActionIsModified;
    }

    /**
     * Manually set whether callAction has been modified or not.
     */
    public void isCallActionModified(boolean value)
    {
        callActionIsModified = value;
    }	

    /**
     * Determines if the callAction has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isCallActionInitialized()
    {
        return callActionIsInitialized;
    }

    /**
     * Manually set whether callAction has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isCallActionInitialized(boolean value)
    {
        callActionIsInitialized = value;
    }



    /**
     * Setter method for reponseStatus.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to reponseStatus
     */
    @Override
    public void setReponseStatus(Integer newVal)
    {
        if ((newVal != null && reponseStatus != null && (newVal.compareTo(reponseStatus) == 0)) ||
            (newVal == null && reponseStatus == null && reponseStatusIsInitialized)) {
            return;
        }
        reponseStatus = newVal;
        reponseStatusIsModified = true;
        reponseStatusIsInitialized = true;
    }

    /**
     * Setter method for reponseStatus.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to reponseStatus
     */
    public void setReponseStatus(int newVal)
    {
        setReponseStatus(new Integer(newVal));
    }

    /**
     * Determines if the reponseStatus has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isReponseStatusModified()
    {
        return reponseStatusIsModified;
    }

    /**
     * Manually set whether reponseStatus has been modified or not.
     */
    public void isReponseStatusModified(boolean value)
    {
        reponseStatusIsModified = value;
    }	

    /**
     * Determines if the reponseStatus has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isReponseStatusInitialized()
    {
        return reponseStatusIsInitialized;
    }

    /**
     * Manually set whether reponseStatus has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isReponseStatusInitialized(boolean value)
    {
        reponseStatusIsInitialized = value;
    }



    /**
     * Setter method for subscriptionStatus.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to subscriptionStatus
     */
    @Override
    public void setSubscriptionStatus(Integer newVal)
    {
        if ((newVal != null && subscriptionStatus != null && (newVal.compareTo(subscriptionStatus) == 0)) ||
            (newVal == null && subscriptionStatus == null && subscriptionStatusIsInitialized)) {
            return;
        }
        subscriptionStatus = newVal;
        subscriptionStatusIsModified = true;
        subscriptionStatusIsInitialized = true;
    }

    /**
     * Setter method for subscriptionStatus.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to subscriptionStatus
     */
    public void setSubscriptionStatus(int newVal)
    {
        setSubscriptionStatus(new Integer(newVal));
    }

    /**
     * Determines if the subscriptionStatus has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isSubscriptionStatusModified()
    {
        return subscriptionStatusIsModified;
    }

    /**
     * Manually set whether subscriptionStatus has been modified or not.
     */
    public void isSubscriptionStatusModified(boolean value)
    {
        subscriptionStatusIsModified = value;
    }	

    /**
     * Determines if the subscriptionStatus has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isSubscriptionStatusInitialized()
    {
        return subscriptionStatusIsInitialized;
    }

    /**
     * Manually set whether subscriptionStatus has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isSubscriptionStatusInitialized(boolean value)
    {
        subscriptionStatusIsInitialized = value;
    }



    /**
     * Setter method for msisdn.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to msisdn
     */
    @Override
    public void setMsisdn(String newVal)
    {
        if ((newVal != null && msisdn != null && (newVal.compareTo(msisdn) == 0)) ||
            (newVal == null && msisdn == null && msisdnIsInitialized)) {
            return;
        }
        msisdn = newVal;
        msisdnIsModified = true;
        msisdnIsInitialized = true;
    }

    /**
     * Determines if the msisdn has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isMsisdnModified()
    {
        return msisdnIsModified;
    }

    /**
     * Manually set whether msisdn has been modified or not.
     */
    public void isMsisdnModified(boolean value)
    {
        msisdnIsModified = value;
    }	

    /**
     * Determines if the msisdn has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isMsisdnInitialized()
    {
        return msisdnIsInitialized;
    }

    /**
     * Manually set whether msisdn has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isMsisdnInitialized(boolean value)
    {
        msisdnIsInitialized = value;
    }

    /**
     * Determines if the current object is new.
     *
     * @return true if the current object is new, false if the object is not new
     */
    public boolean isNew()
    {
        return _isNew;
    }

    /**
     * Specifies to the object if it has been set as new.
     *
     * @param isNew the boolean value to be assigned to the isNew field
     */
    public void isNew(boolean isNew)
    {
        this._isNew = isNew;
    }

    /**
     * Determines if the object has been modified since the last time this method was called.
     * <br>
     * We can also determine if this object has ever been modified since its creation.
     *
     * @return true if the object has been modified, false if the object has not been modified
     */
    public boolean isModified()
    {
        return callDurationIsModified 		|| callActionIsModified  		|| reponseStatusIsModified  		|| subscriptionStatusIsModified  		|| msisdnIsModified  ;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified(boolean isModified)
    {
        callDurationIsModified = isModified;
        callActionIsModified = isModified;
        reponseStatusIsModified = isModified;
        subscriptionStatusIsModified = isModified;
        msisdnIsModified = isModified;
    }

    /**
     * Copies the passed bean into the current bean.
     *
     * @param bean the bean to copy into the current bean
     */
    public void copy(UserBean bean)
    {
        setCallDuration(bean.getCallDuration());
        setCallAction(bean.getCallAction());
        setReponseStatus(bean.getReponseStatus());
        setSubscriptionStatus(bean.getSubscriptionStatus());
        setMsisdn(bean.getMsisdn());
    }

    /**
     * Converts the current object to stripped form of the bean which only includes the properties of the bean and their getters/
     */
    public BaseUserBean toBaseBean()
    {
	BaseUserBean bean = new BaseUserBean();
        bean.setCallDuration(getCallDuration());
        bean.setCallAction(getCallAction());
        bean.setReponseStatus(getReponseStatus());
        bean.setSubscriptionStatus(getSubscriptionStatus());
        bean.setMsisdn(getMsisdn());
	return bean;
    }
    
    /**
     * Copies ALL properties of the passed bean into the current bean including isNew and isModified etc
     *
     * @param bean the bean to copy into the current bean
     */
    public void copyAll(UserBean bean)
    {
	copy(bean);
	this._isNew = bean.isNew();
	
	callDurationIsModified = bean.isCallDurationModified();
  	callDurationIsInitialized= bean.isCallDurationInitialized();
	callActionIsModified = bean.isCallActionModified();
  	callActionIsInitialized= bean.isCallActionInitialized();
	reponseStatusIsModified = bean.isReponseStatusModified();
  	reponseStatusIsInitialized= bean.isReponseStatusInitialized();
	subscriptionStatusIsModified = bean.isSubscriptionStatusModified();
  	subscriptionStatusIsInitialized= bean.isSubscriptionStatusInitialized();
	msisdnIsModified = bean.isMsisdnModified();
  	msisdnIsInitialized= bean.isMsisdnInitialized();
    }    

    /**
     * return a dictionnary of the object
     */
    public Map<String,String> getDictionnary()
    {
        Map<String,String> dictionnary = new HashMap<String,String>();
        dictionnary.put("call_duration", getCallDuration() == null ? "" : getCallDuration().toString());
        dictionnary.put("call_action", getCallAction() == null ? "" : getCallAction().toString());
        dictionnary.put("reponse_status", getReponseStatus() == null ? "" : getReponseStatus().toString());
        dictionnary.put("subscription_status", getSubscriptionStatus() == null ? "" : getSubscriptionStatus().toString());
        dictionnary.put("msisdn", getMsisdn() == null ? "" : getMsisdn().toString());
        return dictionnary;
    }

    /**
     * return a dictionnary of the pk columns
     */
    public Map<String,String> getPkDictionnary()
    {
        Map<String,String> dictionnary = new HashMap<String,String>();
        dictionnary.put("msisdn", getMsisdn() == null ? "" : getMsisdn().toString());
        return dictionnary;
    }

    /**
     * return a the value string representation of the given field
     */
    public String getValue(String column)
    {
        if (null == column || "".equals(column)) {
            return "";
        } else if ("call_duration".equalsIgnoreCase(column) || "callDuration".equalsIgnoreCase(column)) {
            return getCallDuration() == null ? "" : getCallDuration().toString();
        } else if ("call_action".equalsIgnoreCase(column) || "callAction".equalsIgnoreCase(column)) {
            return getCallAction() == null ? "" : getCallAction().toString();
        } else if ("reponse_status".equalsIgnoreCase(column) || "reponseStatus".equalsIgnoreCase(column)) {
            return getReponseStatus() == null ? "" : getReponseStatus().toString();
        } else if ("subscription_status".equalsIgnoreCase(column) || "subscriptionStatus".equalsIgnoreCase(column)) {
            return getSubscriptionStatus() == null ? "" : getSubscriptionStatus().toString();
        } else if ("msisdn".equalsIgnoreCase(column) || "msisdn".equalsIgnoreCase(column)) {
            return getMsisdn() == null ? "" : getMsisdn().toString();
        }
        return "";
    }

    /**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object)
	{
		if (!(object instanceof UserBean)) {
			return false;
		}

		UserBean obj = (UserBean) object;
		return new EqualsBuilder()
            .append(getCallDuration(), obj.getCallDuration())
            .append(getCallAction(), obj.getCallAction())
            .append(getReponseStatus(), obj.getReponseStatus())
            .append(getSubscriptionStatus(), obj.getSubscriptionStatus())
            .append(getMsisdn(), obj.getMsisdn())
            .isEquals();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode()
	{
		return new HashCodeBuilder(-82280557, -700257973)
            .append(getCallDuration())
            .append(getCallAction())
            .append(getReponseStatus())
            .append(getSubscriptionStatus())
            .append(getMsisdn())
            .toHashCode();
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
	    return toString(ToStringStyle.MULTI_LINE_STYLE);
	}

	/**
	 * you can use the following styles:
	 * <li>ToStringStyle.DEFAULT_STYLE</li>
	 * <li>ToStringStyle.MULTI_LINE_STYLE</li>
     * <li>ToStringStyle.NO_FIELD_NAMES_STYLE</li>
     * <li>ToStringStyle.SHORT_PREFIX_STYLE</li>
     * <li>ToStringStyle.SIMPLE_STYLE</li>
	 */
	public String toString(ToStringStyle style) {
		return new ToStringBuilder(this, style)
            .append("call_duration", getCallDuration())
            .append("call_action", getCallAction())
            .append("reponse_status", getReponseStatus())
            .append("subscription_status", getSubscriptionStatus())
            .append("msisdn", getMsisdn())
            .toString();
	}


    public int compareTo(Object object)
    {
        UserBean obj = (UserBean) object;
        return new CompareToBuilder()
            .append(getCallDuration(), obj.getCallDuration())
            .append(getCallAction(), obj.getCallAction())
            .append(getReponseStatus(), obj.getReponseStatus())
            .append(getSubscriptionStatus(), obj.getSubscriptionStatus())
            .append(getMsisdn(), obj.getMsisdn())
            .toComparison();
   }






    //_____________________________________________________________________
    //

    // SAVE
    //_____________________________________________________________________
    /**
     * Saves the UserBean bean into the database.
     *
     * @return the inserted or updated bean
     * @throws DAOException
     */
    //12
    public UserBean save() throws DAOException
    {
        return UserManagerImpl.getInstance().save(this);
    }

    /**
     * Update the UserBean bean record in the database according to the changes.
     *
     * @return the updated bean
     * @throws DAOException
     */
    //14
    public UserBean update() throws DAOException
    {
        return UserManagerImpl.getInstance().update(this);
    }

    /**
     * Inserts the UserBean bean record in the database.
     *
     * @return the updated bean
     * @throws DAOException
     */
    //15
    public UserBean insert() throws DAOException
    {
        return UserManagerImpl.getInstance().insert(this);
    }

    /**
     * Creates and returns a new instance of UserBean.
     *
     * @return
     */
    //15
    public BaseGeneratedBean newBaseInstance()
    {
        return UserManagerImpl.getInstance().createUserBean();
    }

    /**
     * Creates and returns a new instance of UserBean.
     *
     * @return
     */
    //15
    public static UserBean newInstance()
    {
        return UserManagerImpl.getInstance().createUserBean();
    }

    /**
     * Returns manager class for User
     *
     * @return
     */
    //15
    public BaseGeneratedManager getBaseManager()
    {
        return UserManagerImpl.getInstance();
    }

    /**
     * Returns name of the corresponding table i.e. User
     *
     * @return
     */
    //15
    public String getTableName()
    {
        return "user";
    }



}
