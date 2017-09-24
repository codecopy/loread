package me.wizos.loread.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import de.greenrobot.dao.DaoException;
import me.wizos.loread.data.dao.DaoSession;
import me.wizos.loread.data.dao.FeedDao;
import me.wizos.loread.data.dao.TagDao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "TAG".
 */
public class Tag {


    /**
     * Used to resolve relations
     */
    private transient DaoSession daoSession;

    /**
     * Used for active entity operations.
     */
    private transient TagDao myDao;

    private List<Feed> feeds;

    // KEEP FIELDS - put your custom fields here
    @SerializedName("id")
    private String id;
    @SerializedName("sortid")
    private String sortid;
    @SerializedName("title")
    private String title;
//    @SerializedName("unreadcount")
//    private Integer unreadcount;
    // KEEP FIELDS END

    public Tag() {
    }

    public Tag(String id) {
        this.id = id;
    }

    public Tag(String id, String sortid, String title) {
        this.id = id;
        this.sortid = sortid;
        this.title = title;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getTagDao() : null;
    }

    /** Not-null value. */
    public String getId() {
        return id;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setId(String id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getSortid() {
        return sortid;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setSortid(String sortid) {
        this.sortid = sortid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<Feed> getFeeds() {
        if (feeds == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            FeedDao targetDao = daoSession.getFeedDao();
            List<Feed> feedsNew = targetDao._queryTag_Feeds(id);
            synchronized (this) {
                if(feeds == null) {
                    feeds = feedsNew;
                }
            }
        }
        return feeds;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetFeeds() {
        feeds = null;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
