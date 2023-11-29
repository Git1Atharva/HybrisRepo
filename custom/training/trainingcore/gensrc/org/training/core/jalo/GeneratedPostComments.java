/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 28-Nov-2023, 2:03:34 pm                     ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.Posts;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem postComments}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedPostComments extends GenericItem
{
	/** Qualifier of the <code>postComments.commentId</code> attribute **/
	public static final String COMMENTID = "commentId";
	/** Qualifier of the <code>postComments.author</code> attribute **/
	public static final String AUTHOR = "author";
	/** Qualifier of the <code>postComments.content</code> attribute **/
	public static final String CONTENT = "content";
	/** Qualifier of the <code>postComments.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>postComments.postsPOS</code> attribute **/
	public static final String POSTSPOS = "postsPOS";
	/** Qualifier of the <code>postComments.posts</code> attribute **/
	public static final String POSTS = "posts";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n POSTS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPostComments> POSTSHANDLER = new BidirectionalOneToManyHandler<GeneratedPostComments>(
	TrainingCoreConstants.TC.POSTCOMMENTS,
	false,
	"posts",
	"postsPOS",
	true,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMMENTID, AttributeMode.INITIAL);
		tmp.put(AUTHOR, AttributeMode.INITIAL);
		tmp.put(CONTENT, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(POSTSPOS, AttributeMode.INITIAL);
		tmp.put(POSTS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postComments.author</code> attribute.
	 * @return the author
	 */
	public String getAuthor(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AUTHOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postComments.author</code> attribute.
	 * @return the author
	 */
	public String getAuthor()
	{
		return getAuthor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postComments.author</code> attribute. 
	 * @param value the author
	 */
	public void setAuthor(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AUTHOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postComments.author</code> attribute. 
	 * @param value the author
	 */
	public void setAuthor(final String value)
	{
		setAuthor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postComments.commentId</code> attribute.
	 * @return the commentId
	 */
	public String getCommentId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMMENTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postComments.commentId</code> attribute.
	 * @return the commentId
	 */
	public String getCommentId()
	{
		return getCommentId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postComments.commentId</code> attribute. 
	 * @param value the commentId
	 */
	public void setCommentId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMMENTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postComments.commentId</code> attribute. 
	 * @param value the commentId
	 */
	public void setCommentId(final String value)
	{
		setCommentId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postComments.content</code> attribute.
	 * @return the content
	 */
	public String getContent(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postComments.content</code> attribute.
	 * @return the content
	 */
	public String getContent()
	{
		return getContent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postComments.content</code> attribute. 
	 * @param value the content
	 */
	public void setContent(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postComments.content</code> attribute. 
	 * @param value the content
	 */
	public void setContent(final String value)
	{
		setContent( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		POSTSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postComments.posts</code> attribute.
	 * @return the posts
	 */
	public Posts getPosts(final SessionContext ctx)
	{
		return (Posts)getProperty( ctx, POSTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postComments.posts</code> attribute.
	 * @return the posts
	 */
	public Posts getPosts()
	{
		return getPosts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postComments.posts</code> attribute. 
	 * @param value the posts
	 */
	public void setPosts(final SessionContext ctx, final Posts value)
	{
		POSTSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postComments.posts</code> attribute. 
	 * @param value the posts
	 */
	public void setPosts(final Posts value)
	{
		setPosts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postComments.postsPOS</code> attribute.
	 * @return the postsPOS
	 */
	 Integer getPostsPOS(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, POSTSPOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postComments.postsPOS</code> attribute.
	 * @return the postsPOS
	 */
	 Integer getPostsPOS()
	{
		return getPostsPOS( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postComments.postsPOS</code> attribute. 
	 * @return the postsPOS
	 */
	 int getPostsPOSAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPostsPOS( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postComments.postsPOS</code> attribute. 
	 * @return the postsPOS
	 */
	 int getPostsPOSAsPrimitive()
	{
		return getPostsPOSAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postComments.postsPOS</code> attribute. 
	 * @param value the postsPOS
	 */
	 void setPostsPOS(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, POSTSPOS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postComments.postsPOS</code> attribute. 
	 * @param value the postsPOS
	 */
	 void setPostsPOS(final Integer value)
	{
		setPostsPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postComments.postsPOS</code> attribute. 
	 * @param value the postsPOS
	 */
	 void setPostsPOS(final SessionContext ctx, final int value)
	{
		setPostsPOS( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postComments.postsPOS</code> attribute. 
	 * @param value the postsPOS
	 */
	 void setPostsPOS(final int value)
	{
		setPostsPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postComments.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postComments.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postComments.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postComments.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
}
