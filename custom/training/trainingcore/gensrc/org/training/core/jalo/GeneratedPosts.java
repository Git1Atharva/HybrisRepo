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
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.Blog;
import org.training.core.jalo.PostComments;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem posts}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedPosts extends GenericItem
{
	/** Qualifier of the <code>posts.postId</code> attribute **/
	public static final String POSTID = "postId";
	/** Qualifier of the <code>posts.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>posts.author</code> attribute **/
	public static final String AUTHOR = "author";
	/** Qualifier of the <code>posts.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>posts.content</code> attribute **/
	public static final String CONTENT = "content";
	/** Qualifier of the <code>posts.Keywords</code> attribute **/
	public static final String KEYWORDS = "Keywords";
	/** Qualifier of the <code>posts.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>posts.blogPOS</code> attribute **/
	public static final String BLOGPOS = "blogPOS";
	/** Qualifier of the <code>posts.blog</code> attribute **/
	public static final String BLOG = "blog";
	/** Qualifier of the <code>posts.postComments</code> attribute **/
	public static final String POSTCOMMENTS = "postComments";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BLOG's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPosts> BLOGHANDLER = new BidirectionalOneToManyHandler<GeneratedPosts>(
	TrainingCoreConstants.TC.POSTS,
	false,
	"blog",
	"blogPOS",
	true,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n POSTCOMMENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PostComments> POSTCOMMENTSHANDLER = new OneToManyHandler<PostComments>(
	TrainingCoreConstants.TC.POSTCOMMENTS,
	true,
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
		tmp.put(POSTID, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(AUTHOR, AttributeMode.INITIAL);
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(CONTENT, AttributeMode.INITIAL);
		tmp.put(KEYWORDS, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(BLOGPOS, AttributeMode.INITIAL);
		tmp.put(BLOG, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.author</code> attribute.
	 * @return the author
	 */
	public String getAuthor(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AUTHOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.author</code> attribute.
	 * @return the author
	 */
	public String getAuthor()
	{
		return getAuthor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.author</code> attribute. 
	 * @param value the author
	 */
	public void setAuthor(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AUTHOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.author</code> attribute. 
	 * @param value the author
	 */
	public void setAuthor(final String value)
	{
		setAuthor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.blog</code> attribute.
	 * @return the blog
	 */
	public Blog getBlog(final SessionContext ctx)
	{
		return (Blog)getProperty( ctx, BLOG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.blog</code> attribute.
	 * @return the blog
	 */
	public Blog getBlog()
	{
		return getBlog( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.blog</code> attribute. 
	 * @param value the blog
	 */
	public void setBlog(final SessionContext ctx, final Blog value)
	{
		BLOGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.blog</code> attribute. 
	 * @param value the blog
	 */
	public void setBlog(final Blog value)
	{
		setBlog( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.blogPOS</code> attribute.
	 * @return the blogPOS
	 */
	 Integer getBlogPOS(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, BLOGPOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.blogPOS</code> attribute.
	 * @return the blogPOS
	 */
	 Integer getBlogPOS()
	{
		return getBlogPOS( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.blogPOS</code> attribute. 
	 * @return the blogPOS
	 */
	 int getBlogPOSAsPrimitive(final SessionContext ctx)
	{
		Integer value = getBlogPOS( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.blogPOS</code> attribute. 
	 * @return the blogPOS
	 */
	 int getBlogPOSAsPrimitive()
	{
		return getBlogPOSAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.blogPOS</code> attribute. 
	 * @param value the blogPOS
	 */
	 void setBlogPOS(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, BLOGPOS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.blogPOS</code> attribute. 
	 * @param value the blogPOS
	 */
	 void setBlogPOS(final Integer value)
	{
		setBlogPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.blogPOS</code> attribute. 
	 * @param value the blogPOS
	 */
	 void setBlogPOS(final SessionContext ctx, final int value)
	{
		setBlogPOS( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.blogPOS</code> attribute. 
	 * @param value the blogPOS
	 */
	 void setBlogPOS(final int value)
	{
		setBlogPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.content</code> attribute.
	 * @return the content
	 */
	public String getContent(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.content</code> attribute.
	 * @return the content
	 */
	public String getContent()
	{
		return getContent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.content</code> attribute. 
	 * @param value the content
	 */
	public void setContent(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.content</code> attribute. 
	 * @param value the content
	 */
	public void setContent(final String value)
	{
		setContent( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BLOGHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.date</code> attribute.
	 * @return the date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.date</code> attribute.
	 * @return the date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.Keywords</code> attribute.
	 * @return the Keywords
	 */
	public String getKeywords(final SessionContext ctx)
	{
		return (String)getProperty( ctx, KEYWORDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.Keywords</code> attribute.
	 * @return the Keywords
	 */
	public String getKeywords()
	{
		return getKeywords( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.Keywords</code> attribute. 
	 * @param value the Keywords
	 */
	public void setKeywords(final SessionContext ctx, final String value)
	{
		setProperty(ctx, KEYWORDS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.Keywords</code> attribute. 
	 * @param value the Keywords
	 */
	public void setKeywords(final String value)
	{
		setKeywords( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.postComments</code> attribute.
	 * @return the postComments
	 */
	public Collection<PostComments> getPostComments(final SessionContext ctx)
	{
		return POSTCOMMENTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.postComments</code> attribute.
	 * @return the postComments
	 */
	public Collection<PostComments> getPostComments()
	{
		return getPostComments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.postComments</code> attribute. 
	 * @param value the postComments
	 */
	public void setPostComments(final SessionContext ctx, final Collection<PostComments> value)
	{
		POSTCOMMENTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.postComments</code> attribute. 
	 * @param value the postComments
	 */
	public void setPostComments(final Collection<PostComments> value)
	{
		setPostComments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to postComments. 
	 * @param value the item to add to postComments
	 */
	public void addToPostComments(final SessionContext ctx, final PostComments value)
	{
		POSTCOMMENTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to postComments. 
	 * @param value the item to add to postComments
	 */
	public void addToPostComments(final PostComments value)
	{
		addToPostComments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from postComments. 
	 * @param value the item to remove from postComments
	 */
	public void removeFromPostComments(final SessionContext ctx, final PostComments value)
	{
		POSTCOMMENTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from postComments. 
	 * @param value the item to remove from postComments
	 */
	public void removeFromPostComments(final PostComments value)
	{
		removeFromPostComments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.postId</code> attribute.
	 * @return the postId
	 */
	public Integer getPostId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, POSTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.postId</code> attribute.
	 * @return the postId
	 */
	public Integer getPostId()
	{
		return getPostId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.postId</code> attribute. 
	 * @return the postId
	 */
	public int getPostIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPostId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.postId</code> attribute. 
	 * @return the postId
	 */
	public int getPostIdAsPrimitive()
	{
		return getPostIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.postId</code> attribute. 
	 * @param value the postId
	 */
	public void setPostId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, POSTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.postId</code> attribute. 
	 * @param value the postId
	 */
	public void setPostId(final Integer value)
	{
		setPostId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.postId</code> attribute. 
	 * @param value the postId
	 */
	public void setPostId(final SessionContext ctx, final int value)
	{
		setPostId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.postId</code> attribute. 
	 * @param value the postId
	 */
	public void setPostId(final int value)
	{
		setPostId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.title</code> attribute.
	 * @return the title
	 */
	public String getTitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>posts.title</code> attribute.
	 * @return the title
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>posts.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
}
