.class public final LP/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/c;
.implements Lu/D0;


# instance fields
.field public final q:I

.field public r:I

.field public final s:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    .line 17
    new-array v0, v0, [LP/Y;

    iput-object v0, p0, LP/Y;->s:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 18
    iput v0, p0, LP/Y;->q:I

    .line 19
    iput v0, p0, LP/Y;->r:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, LP/Y;->s:Ljava/lang/Object;

    .line 22
    iput p1, p0, LP/Y;->q:I

    and-int/lit8 p1, p2, 0x7

    if-nez p1, :cond_0

    const/16 p1, 0x8

    .line 23
    :cond_0
    iput p1, p0, LP/Y;->r:I

    return-void
.end method

.method public constructor <init>(IILu/x;)V
    .locals 2

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput p1, p0, LP/Y;->q:I

    .line 27
    iput p2, p0, LP/Y;->r:I

    .line 28
    new-instance v0, LE/c0;

    new-instance v1, Lu/C;

    invoke-direct {v1, p1, p2, p3}, Lu/C;-><init>(IILu/x;)V

    invoke-direct {v0, v1}, LE/c0;-><init>(Lu/A;)V

    iput-object v0, p0, LP/Y;->s:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LP/c;I)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP/Y;->s:Ljava/lang/Object;

    iput p2, p0, LP/Y;->q:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LP/Y;->s:Ljava/lang/Object;

    const/4 v0, -0x1

    .line 3
    iput v0, p0, LP/Y;->r:I

    .line 4
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object p2

    .line 5
    sget-object v0, Lg1/r;->h:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 6
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    if-nez v2, :cond_0

    .line 8
    iget v3, p0, LP/Y;->q:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, LP/Y;->q:I

    goto :goto_1

    :cond_0
    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 9
    iget v3, p0, LP/Y;->r:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, LP/Y;->r:I

    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v3

    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 12
    const-string v4, "layout"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 13
    new-instance v3, Lg1/n;

    invoke-direct {v3}, Lg1/n;-><init>()V

    .line 14
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v3, v2}, Lg1/n;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 15
    :cond_2
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LP/Y;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LP/c;

    .line 4
    .line 5
    iget v1, p0, LP/Y;->r:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget v1, p0, LP/Y;->q:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    add-int/2addr p1, v1

    .line 14
    invoke-interface {v0, p1, p2}, LP/c;->c(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, LP/Y;->r:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, LP/Y;->r:I

    .line 6
    .line 7
    iget-object v0, p0, LP/Y;->s:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LP/c;

    .line 10
    .line 11
    invoke-interface {v0, p1}, LP/c;->d(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public g(JLu/q;Lu/q;Lu/q;)Lu/q;
    .locals 7

    .line 1
    iget-object v0, p0, LP/Y;->s:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, LE/c0;

    .line 5
    .line 6
    move-wide v2, p1

    .line 7
    move-object v4, p3

    .line 8
    move-object v5, p4

    .line 9
    move-object v6, p5

    .line 10
    invoke-virtual/range {v1 .. v6}, LE/c0;->g(JLu/q;Lu/q;Lu/q;)Lu/q;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public h(ILjava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LP/Y;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LP/c;

    .line 4
    .line 5
    iget v1, p0, LP/Y;->r:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget v1, p0, LP/Y;->q:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    add-int/2addr p1, v1

    .line 14
    invoke-interface {v0, p1, p2}, LP/c;->h(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public i(III)V
    .locals 2

    .line 1
    iget v0, p0, LP/Y;->r:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, LP/Y;->q:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object v1, p0, LP/Y;->s:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, LP/c;

    .line 12
    .line 13
    add-int/2addr p1, v0

    .line 14
    add-int/2addr p2, v0

    .line 15
    invoke-interface {v1, p1, p2, p3}, LP/c;->i(III)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public j()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LP/Y;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LP/c;

    .line 4
    .line 5
    invoke-interface {v0}, LP/c;->j()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public k(II)V
    .locals 2

    .line 1
    iget-object v0, p0, LP/Y;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LP/c;

    .line 4
    .line 5
    iget v1, p0, LP/Y;->r:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget v1, p0, LP/Y;->q:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    add-int/2addr p1, v1

    .line 14
    invoke-interface {v0, p1, p2}, LP/c;->k(II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public l()I
    .locals 1

    .line 1
    iget v0, p0, LP/Y;->r:I

    .line 2
    .line 3
    return v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget v0, p0, LP/Y;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public n(JLu/q;Lu/q;Lu/q;)Lu/q;
    .locals 7

    .line 1
    iget-object v0, p0, LP/Y;->s:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, LE/c0;

    .line 5
    .line 6
    move-wide v2, p1

    .line 7
    move-object v4, p3

    .line 8
    move-object v5, p4

    .line 9
    move-object v6, p5

    .line 10
    invoke-virtual/range {v1 .. v6}, LE/c0;->n(JLu/q;Lu/q;Lu/q;)Lu/q;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public o()V
    .locals 1

    .line 1
    iget v0, p0, LP/Y;->r:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "OffsetApplier up called with no corresponding down"

    .line 11
    .line 12
    invoke-static {v0}, LP/p;->c(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_1
    iget v0, p0, LP/Y;->r:I

    .line 16
    .line 17
    add-int/lit8 v0, v0, -0x1

    .line 18
    .line 19
    iput v0, p0, LP/Y;->r:I

    .line 20
    .line 21
    iget-object v0, p0, LP/Y;->s:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, LP/c;

    .line 24
    .line 25
    invoke-interface {v0}, LP/c;->o()V

    .line 26
    .line 27
    .line 28
    return-void
.end method
