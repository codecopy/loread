package me.wizos.loread.data.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;
import me.wizos.loread.bean.Img;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "IMG".
 */
public class ImgDao extends AbstractDao<Img, Long> {

    public static final String TABLENAME = "IMG";

    /**
     * Properties of entity Img.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property No = new Property(1, Integer.class, "no", false, "NO");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property Src = new Property(3, String.class, "src", false, "SRC");
        public final static Property ArticleId = new Property(4, String.class, "articleId", false, "ARTICLE_ID");
        public final static Property DownState = new Property(5, Integer.class, "downState", false, "DOWN_STATE");
    }


    public ImgDao(DaoConfig config) {
        super(config);
    }

    public ImgDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"IMG\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"NO\" INTEGER," + // 1: no
                "\"NAME\" TEXT," + // 2: name
                "\"SRC\" TEXT," + // 3: src
                "\"ARTICLE_ID\" TEXT," + // 4: articleId
                "\"DOWN_STATE\" INTEGER);"); // 5: downState
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"IMG\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Img entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer no = entity.getNo();
        if (no != null) {
            stmt.bindLong(2, no);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String src = entity.getSrc();
        if (src != null) {
            stmt.bindString(4, src);
        }
 
        String articleId = entity.getArticleId();
        if (articleId != null) {
            stmt.bindString(5, articleId);
        }
 
        Integer downState = entity.getDownState();
        if (downState != null) {
            stmt.bindLong(6, downState);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Img readEntity(Cursor cursor, int offset) {
        Img entity = new Img( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // no
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
                cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // src
                cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // articleId
                cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5) // downState
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Img entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNo(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSrc(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setArticleId(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDownState(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Img entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Img entity) {
        if (entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
