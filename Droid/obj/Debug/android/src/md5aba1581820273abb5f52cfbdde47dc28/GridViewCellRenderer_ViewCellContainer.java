package md5aba1581820273abb5f52cfbdde47dc28;


public class GridViewCellRenderer_ViewCellContainer
	extends android.view.ViewGroup
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\n" +
			"";
		mono.android.Runtime.register ("XLabs.Forms.Controls.GridViewCellRenderer/ViewCellContainer, XLabs.Forms.Droid, Version=2.0.5782.12263, Culture=neutral, PublicKeyToken=null", GridViewCellRenderer_ViewCellContainer.class, __md_methods);
	}


	public GridViewCellRenderer_ViewCellContainer (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == GridViewCellRenderer_ViewCellContainer.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.GridViewCellRenderer/ViewCellContainer, XLabs.Forms.Droid, Version=2.0.5782.12263, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public GridViewCellRenderer_ViewCellContainer (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == GridViewCellRenderer_ViewCellContainer.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.GridViewCellRenderer/ViewCellContainer, XLabs.Forms.Droid, Version=2.0.5782.12263, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public GridViewCellRenderer_ViewCellContainer (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == GridViewCellRenderer_ViewCellContainer.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.GridViewCellRenderer/ViewCellContainer, XLabs.Forms.Droid, Version=2.0.5782.12263, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public GridViewCellRenderer_ViewCellContainer (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) throws java.lang.Throwable
	{
		super (p0, p1, p2, p3);
		if (getClass () == GridViewCellRenderer_ViewCellContainer.class)
			mono.android.TypeManager.Activate ("XLabs.Forms.Controls.GridViewCellRenderer/ViewCellContainer, XLabs.Forms.Droid, Version=2.0.5782.12263, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void onLayout (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayout (p0, p1, p2, p3, p4);
	}

	private native void n_onLayout (boolean p0, int p1, int p2, int p3, int p4);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}