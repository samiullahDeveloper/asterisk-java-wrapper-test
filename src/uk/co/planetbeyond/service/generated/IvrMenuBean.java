




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

import uk.co.planetbeyond.service.manager.IvrMenuManagerImpl;
import uk.co.planetbeyond.service.generated.GeneratedBean;





import uk.co.planetbeyond.service.generated.exception.DAOException;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.sleepycat.persist.model.Persistent;

/**
 * IvrMenuBean is a mapping of ivr_menu Table.
 * @author sql2java
*/
@Persistent
public class IvrMenuBean extends BaseIvrMenuBean implements Serializable, GeneratedBean, JoinHelperInterface
{
	private static final long serialVersionUID = 7126826189280479462L;
	
    private boolean fileNameIsModified = false;
    private boolean fileNameIsInitialized = false;

    private boolean ivrMenuIdIsModified = false;
    private boolean ivrMenuIdIsInitialized = false;

    private boolean _isNew = true;

    /**
     * Prefered methods to create a IvrMenuBean is via the createIvrMenuBean method in IvrMenuManager or
     * via the factory class IvrMenuFactory create method
     */
    public IvrMenuBean()
    {
    }



    /**
     * Setter method for fileName.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to fileName
     */
    @Override
    public void setFileName(String newVal)
    {
        if ((newVal != null && fileName != null && (newVal.compareTo(fileName) == 0)) ||
            (newVal == null && fileName == null && fileNameIsInitialized)) {
            return;
        }
        fileName = newVal;
        fileNameIsModified = true;
        fileNameIsInitialized = true;
    }

    /**
     * Determines if the fileName has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isFileNameModified()
    {
        return fileNameIsModified;
    }

    /**
     * Manually set whether fileName has been modified or not.
     */
    public void isFileNameModified(boolean value)
    {
        fileNameIsModified = value;
    }	

    /**
     * Determines if the fileName has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isFileNameInitialized()
    {
        return fileNameIsInitialized;
    }

    /**
     * Manually set whether fileName has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isFileNameInitialized(boolean value)
    {
        fileNameIsInitialized = value;
    }



    /**
     * Setter method for ivrMenuId.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to ivrMenuId
     */
    @Override
    public void setIvrMenuId(Integer newVal)
    {
        if ((newVal != null && ivrMenuId != null && (newVal.compareTo(ivrMenuId) == 0)) ||
            (newVal == null && ivrMenuId == null && ivrMenuIdIsInitialized)) {
            return;
        }
        ivrMenuId = newVal;
        ivrMenuIdIsModified = true;
        ivrMenuIdIsInitialized = true;
    }

    /**
     * Setter method for ivrMenuId.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to ivrMenuId
     */
    public void setIvrMenuId(int newVal)
    {
        setIvrMenuId(new Integer(newVal));
    }

    /**
     * Determines if the ivrMenuId has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isIvrMenuIdModified()
    {
        return ivrMenuIdIsModified;
    }

    /**
     * Manually set whether ivrMenuId has been modified or not.
     */
    public void isIvrMenuIdModified(boolean value)
    {
        ivrMenuIdIsModified = value;
    }	

    /**
     * Determines if the ivrMenuId has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isIvrMenuIdInitialized()
    {
        return ivrMenuIdIsInitialized;
    }

    /**
     * Manually set whether ivrMenuId has been initialized or not.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     */
    public void isIvrMenuIdInitialized(boolean value)
    {
        ivrMenuIdIsInitialized = value;
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
        return fileNameIsModified 		|| ivrMenuIdIsModified  ;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified(boolean isModified)
    {
        fileNameIsModified = isModified;
        ivrMenuIdIsModified = isModified;
    }

    /**
     * Copies the passed bean into the current bean.
     *
     * @param bean the bean to copy into the current bean
     */
    public void copy(IvrMenuBean bean)
    {
        setFileName(bean.getFileName());
        setIvrMenuId(bean.getIvrMenuId());
    }

    /**
     * Converts the current object to stripped form of the bean which only includes the properties of the bean and their getters/
     */
    public BaseIvrMenuBean toBaseBean()
    {
	BaseIvrMenuBean bean = new BaseIvrMenuBean();
        bean.setFileName(getFileName());
        bean.setIvrMenuId(getIvrMenuId());
	return bean;
    }
    
    /**
     * Copies ALL properties of the passed bean into the current bean including isNew and isModified etc
     *
     * @param bean the bean to copy into the current bean
     */
    public void copyAll(IvrMenuBean bean)
    {
	copy(bean);
	this._isNew = bean.isNew();
	
	fileNameIsModified = bean.isFileNameModified();
  	fileNameIsInitialized= bean.isFileNameInitialized();
	ivrMenuIdIsModified = bean.isIvrMenuIdModified();
  	ivrMenuIdIsInitialized= bean.isIvrMenuIdInitialized();
    }    

    /**
     * return a dictionnary of the object
     */
    public Map<String,String> getDictionnary()
    {
        Map<String,String> dictionnary = new HashMap<String,String>();
        dictionnary.put("file_name", getFileName() == null ? "" : getFileName().toString());
        dictionnary.put("ivr_menu_id", getIvrMenuId() == null ? "" : getIvrMenuId().toString());
        return dictionnary;
    }

    /**
     * return a dictionnary of the pk columns
     */
    public Map<String,String> getPkDictionnary()
    {
        Map<String,String> dictionnary = new HashMap<String,String>();
        dictionnary.put("ivr_menu_id", getIvrMenuId() == null ? "" : getIvrMenuId().toString());
        return dictionnary;
    }

    /**
     * return a the value string representation of the given field
     */
    public String getValue(String column)
    {
        if (null == column || "".equals(column)) {
            return "";
        } else if ("file_name".equalsIgnoreCase(column) || "fileName".equalsIgnoreCase(column)) {
            return getFileName() == null ? "" : getFileName().toString();
        } else if ("ivr_menu_id".equalsIgnoreCase(column) || "ivrMenuId".equalsIgnoreCase(column)) {
            return getIvrMenuId() == null ? "" : getIvrMenuId().toString();
        }
        return "";
    }

    /**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object)
	{
		if (!(object instanceof IvrMenuBean)) {
			return false;
		}

		IvrMenuBean obj = (IvrMenuBean) object;
		return new EqualsBuilder()
            .append(getFileName(), obj.getFileName())
            .append(getIvrMenuId(), obj.getIvrMenuId())
            .isEquals();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode()
	{
		return new HashCodeBuilder(-82280557, -700257973)
            .append(getFileName())
            .append(getIvrMenuId())
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
            .append("file_name", getFileName())
            .append("ivr_menu_id", getIvrMenuId())
            .toString();
	}


    public int compareTo(Object object)
    {
        IvrMenuBean obj = (IvrMenuBean) object;
        return new CompareToBuilder()
            .append(getFileName(), obj.getFileName())
            .append(getIvrMenuId(), obj.getIvrMenuId())
            .toComparison();
   }






    //_____________________________________________________________________
    //

    // SAVE
    //_____________________________________________________________________
    /**
     * Saves the IvrMenuBean bean into the database.
     *
     * @return the inserted or updated bean
     * @throws DAOException
     */
    //12
    public IvrMenuBean save() throws DAOException
    {
        return IvrMenuManagerImpl.getInstance().save(this);
    }

    /**
     * Update the IvrMenuBean bean record in the database according to the changes.
     *
     * @return the updated bean
     * @throws DAOException
     */
    //14
    public IvrMenuBean update() throws DAOException
    {
        return IvrMenuManagerImpl.getInstance().update(this);
    }

    /**
     * Inserts the IvrMenuBean bean record in the database.
     *
     * @return the updated bean
     * @throws DAOException
     */
    //15
    public IvrMenuBean insert() throws DAOException
    {
        return IvrMenuManagerImpl.getInstance().insert(this);
    }

    /**
     * Creates and returns a new instance of IvrMenuBean.
     *
     * @return
     */
    //15
    public BaseGeneratedBean newBaseInstance()
    {
        return IvrMenuManagerImpl.getInstance().createIvrMenuBean();
    }

    /**
     * Creates and returns a new instance of IvrMenuBean.
     *
     * @return
     */
    //15
    public static IvrMenuBean newInstance()
    {
        return IvrMenuManagerImpl.getInstance().createIvrMenuBean();
    }

    /**
     * Returns manager class for IvrMenu
     *
     * @return
     */
    //15
    public BaseGeneratedManager getBaseManager()
    {
        return IvrMenuManagerImpl.getInstance();
    }

    /**
     * Returns name of the corresponding table i.e. IvrMenu
     *
     * @return
     */
    //15
    public String getTableName()
    {
        return "ivr_menu";
    }



}
