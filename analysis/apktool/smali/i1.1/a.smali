.class public Li1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/m;
.implements Lm/D0;
.implements Ll/w;
.implements Lm/W;
.implements Ll/j;
.implements Lu/r;
.implements LF2/b;
.implements Lw1/c;
.implements Lx/b;
.implements Lx3/b;
.implements Lz4/c;


# instance fields
.field public final synthetic q:I

.field public r:Ljava/lang/Object;


# direct methods
.method public constructor <init>(FLu/q;)V
    .locals 5

    const/16 v0, 0x8

    iput v0, p0, Li1/a;->q:I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    invoke-virtual {p2}, Lu/q;->b()I

    move-result v0

    new-array v1, v0, [Lu/B;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 34
    new-instance v3, Lu/B;

    invoke-virtual {p2, v2}, Lu/q;->a(I)F

    move-result v4

    invoke-direct {v3, p1, v4}, Lu/B;-><init>(FF)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 35
    :cond_0
    iput-object v1, p0, Li1/a;->r:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Li1/a;->q:I

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 7
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p1, v0, :cond_0

    .line 9
    new-instance p1, Lx1/g;

    .line 10
    invoke-direct {p1, p0}, Lx1/f;-><init>(Li1/a;)V

    .line 11
    iput-object p1, p0, Li1/a;->r:Ljava/lang/Object;

    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Lx1/f;

    invoke-direct {p1, p0}, Lx1/f;-><init>(Li1/a;)V

    iput-object p1, p0, Li1/a;->r:Ljava/lang/Object;

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Li1/a;->q:I

    iput-object p2, p0, Li1/a;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LC3/b;)V
    .locals 3

    const/16 v0, 0x15

    iput v0, p0, Li1/a;->q:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Li1/a;

    const/16 v1, 0x14

    invoke-direct {v0, v1, p1}, Li1/a;-><init>(ILjava/lang/Object;)V

    new-instance p1, Ly4/d;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, Ly4/d;-><init>(Li1/a;I)V

    invoke-static {p1}, Lz4/b;->a(Lz4/c;)Lz4/c;

    move-result-object p1

    new-instance v1, Lv3/l;

    const/4 v2, 0x7

    invoke-direct {v1, v2, v0, p1}, Lv3/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 3
    invoke-static {v1}, Lz4/b;->a(Lz4/c;)Lz4/c;

    move-result-object p1

    new-instance v1, Ly4/d;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ly4/d;-><init>(Li1/a;I)V

    .line 4
    invoke-static {v1}, Lz4/b;->a(Lz4/c;)Lz4/c;

    move-result-object v1

    new-instance v2, Lt2/e;

    invoke-direct {v2, p1, v1, v0}, Lt2/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 5
    invoke-static {v2}, Lz4/b;->a(Lz4/c;)Lz4/c;

    move-result-object p1

    new-instance v0, Li3/a;

    const/16 v1, 0x14

    invoke-direct {v0, v1, p1}, Li3/a;-><init>(ILjava/lang/Object;)V

    .line 6
    invoke-static {v0}, Lz4/b;->a(Lz4/c;)Lz4/c;

    move-result-object p1

    iput-object p1, p0, Li1/a;->r:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, Li1/a;->q:I

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-static {p1, p2}, Lc4/a;->f(Landroid/content/ClipData;I)Landroid/view/ContentInfo$Builder;

    move-result-object p1

    iput-object p1, p0, Li1/a;->r:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V
    .locals 2

    const/16 v0, 0x13

    iput v0, p0, Li1/a;->q:I

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    .line 28
    new-instance v0, Ly1/e;

    invoke-direct {v0, p1, p2, p3}, Ly1/e;-><init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V

    iput-object v0, p0, Li1/a;->r:Ljava/lang/Object;

    goto :goto_0

    .line 29
    :cond_0
    new-instance v0, Lt2/e;

    invoke-direct {v0, p1, p2, p3}, Lt2/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Li1/a;->r:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .locals 2

    const/16 v0, 0xf

    iput v0, p0, Li1/a;->q:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Li3/a;

    invoke-direct {v0, p2}, Li3/a;-><init>(Landroid/view/View;)V

    .line 15
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt p2, v1, :cond_0

    .line 16
    new-instance p2, Lw1/s0;

    .line 17
    invoke-direct {p2, p1, v0}, Lw1/r0;-><init>(Landroid/view/Window;Li3/a;)V

    .line 18
    iput-object p2, p0, Li1/a;->r:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1e

    if-lt p2, v1, :cond_1

    .line 19
    new-instance p2, Lw1/r0;

    invoke-direct {p2, p1, v0}, Lw1/r0;-><init>(Landroid/view/Window;Li3/a;)V

    iput-object p2, p0, Li1/a;->r:Ljava/lang/Object;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1a

    if-lt p2, v1, :cond_2

    .line 20
    new-instance p2, Lw1/q0;

    .line 21
    invoke-direct {p2, p1, v0}, Lw1/p0;-><init>(Landroid/view/Window;Li3/a;)V

    .line 22
    iput-object p2, p0, Li1/a;->r:Ljava/lang/Object;

    goto :goto_0

    .line 23
    :cond_2
    new-instance p2, Lw1/p0;

    .line 24
    invoke-direct {p2, p1, v0}, Lw1/p0;-><init>(Landroid/view/Window;Li3/a;)V

    .line 25
    iput-object p2, p0, Li1/a;->r:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method private final w(Ll/l;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public A(FF)V
    .locals 1

    .line 1
    iget-object v0, p0, Li1/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LB0/G0;

    .line 4
    .line 5
    invoke-virtual {v0}, LB0/G0;->t()Lj0/m;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p1, p2}, Lj0/m;->h(FF)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public a(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public b(Ll/l;Z)V
    .locals 2

    .line 1
    instance-of v0, p1, Ll/D;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ll/D;

    .line 7
    .line 8
    iget-object v0, v0, Ll/D;->z:Ll/l;

    .line 9
    .line 10
    invoke-virtual {v0}, Ll/l;->k()Ll/l;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Ll/l;->c(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Li1/a;->r:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lm/j;

    .line 21
    .line 22
    iget-object v0, v0, Lm/j;->u:Ll/w;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0, p1, p2}, Ll/w;->b(Ll/l;Z)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public build()Lw1/f;
    .locals 3

    .line 1
    new-instance v0, Lw1/f;

    .line 2
    .line 3
    new-instance v1, Li3/a;

    .line 4
    .line 5
    iget-object v2, p0, Li1/a;->r:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Landroid/view/ContentInfo$Builder;

    .line 8
    .line 9
    invoke-static {v2}, Lc4/a;->g(Landroid/view/ContentInfo$Builder;)Landroid/view/ContentInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, v2}, Li3/a;-><init>(Landroid/view/ContentInfo;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Lw1/f;-><init>(Lw1/e;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public c(Landroid/view/View;Lw1/o0;)Lw1/o0;
    .locals 5

    .line 1
    iget-object p1, p2, Lw1/o0;->a:Lw1/l0;

    .line 2
    .line 3
    iget-object v0, p0, Li1/a;->r:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 6
    .line 7
    iget-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->D:Lw1/o0;

    .line 8
    .line 9
    invoke-static {v1, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_5

    .line 14
    .line 15
    iput-object p2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->D:Lw1/o0;

    .line 16
    .line 17
    invoke-virtual {p2}, Lw1/o0;->d()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x1

    .line 23
    if-lez v1, :cond_0

    .line 24
    .line 25
    move v1, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v1, v2

    .line 28
    :goto_0
    iput-boolean v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->E:Z

    .line 29
    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v3, v2

    .line 40
    :goto_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lw1/l0;->o()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_2
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    :goto_2
    if-ge v2, v1, :cond_4

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    sget-object v4, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 61
    .line 62
    invoke-virtual {v3}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Li1/e;

    .line 73
    .line 74
    iget-object v3, v3, Li1/e;->a:Li1/b;

    .line 75
    .line 76
    if-eqz v3, :cond_3

    .line 77
    .line 78
    invoke-virtual {p1}, Lw1/l0;->o()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_3

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    :goto_3
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 89
    .line 90
    .line 91
    :cond_5
    return-object p2
.end method

.method public d(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Li1/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu2/n;

    .line 4
    .line 5
    new-instance v1, Lu2/e;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lu2/n;->j(Landroid/graphics/drawable/Drawable;)Lo0/b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    invoke-direct {v1, p1}, Lu2/e;-><init>(Lo0/b;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lu2/n;->k(Lu2/g;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public e(Ll/l;Landroid/view/MenuItem;)Z
    .locals 6

    .line 1
    iget p1, p0, Li1/a;->q:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Li1/a;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lb4/e;

    .line 9
    .line 10
    iget-object p1, p1, Ln4/k;->u:Ln4/i;

    .line 11
    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    check-cast p1, LW4/b;

    .line 15
    .line 16
    iget-object v0, p1, LW4/b;->a:Lb4/e;

    .line 17
    .line 18
    iget-object v1, p1, LW4/b;->b:Landroid/content/res/ColorStateList;

    .line 19
    .line 20
    iget-object v2, p1, LW4/b;->c:Landroid/content/res/ColorStateList;

    .line 21
    .line 22
    iget-object v3, p1, LW4/b;->d:Ljava/util/ArrayList;

    .line 23
    .line 24
    iget-object v4, p1, LW4/b;->e:LR4/k1;

    .line 25
    .line 26
    iget-object p1, p1, LW4/b;->f:Lkotlin/jvm/internal/w;

    .line 27
    .line 28
    const-string v5, "item"

    .line 29
    .line 30
    invoke-static {p2, v5}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    invoke-virtual {v0, v1}, Ln4/k;->setItemTextColor(Landroid/content/res/ColorStateList;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ln4/k;->setItemIconTintList(Landroid/content/res/ColorStateList;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v0, p2, -0x1

    .line 44
    .line 45
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "get(...)"

    .line 50
    .line 51
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    check-cast v1, Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v4, v1}, LC3/a;->C(LR4/k1;Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    iget-object v1, v4, LR4/k1;->M:LO3/e0;

    .line 63
    .line 64
    invoke-virtual {v1}, LO3/e0;->b()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_0

    .line 69
    .line 70
    iget-object v1, v4, LR4/k1;->k:Landroid/webkit/WebView;

    .line 71
    .line 72
    if-eqz v1, :cond_0

    .line 73
    .line 74
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_0
    iget p1, p1, Lkotlin/jvm/internal/w;->q:I

    .line 84
    .line 85
    if-ne p1, p2, :cond_1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    const/4 p1, 0x1

    .line 89
    goto :goto_1

    .line 90
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 91
    :goto_1
    return p1

    .line 92
    :pswitch_0
    iget-object p1, p0, Li1/a;->r:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    const/4 p1, 0x0

    .line 100
    return p1

    .line 101
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Li1/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu3/e;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1}, Lu3/e;->onConnected(Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public g(Ll/l;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Li1/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm/j;

    .line 4
    .line 5
    iget-object v1, v0, Lm/j;->s:Ll/l;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne p1, v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    move-object v1, p1

    .line 12
    check-cast v1, Ll/D;

    .line 13
    .line 14
    iget-object v1, v1, Ll/D;->A:Ll/n;

    .line 15
    .line 16
    iget v1, v1, Ll/n;->a:I

    .line 17
    .line 18
    iput v1, v0, Lm/j;->O:I

    .line 19
    .line 20
    iget-object v0, v0, Lm/j;->u:Ll/w;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {v0, p1}, Ll/w;->g(Ll/l;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    :cond_1
    return v2
.end method

.method public get(I)Lu/A;
    .locals 1

    .line 1
    iget v0, p0, Li1/a;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Li1/a;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lu/A;

    .line 9
    .line 10
    return-object p1

    .line 11
    :pswitch_0
    iget-object v0, p0, Li1/a;->r:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, [Lu/B;

    .line 14
    .line 15
    aget-object p1, v0, p1

    .line 16
    .line 17
    return-object p1

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public h(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public i(Ll/l;)V
    .locals 1

    .line 1
    iget p1, p0, Li1/a;->q:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p1, p0, Li1/a;->r:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 10
    .line 11
    iget-object v0, p1, Landroidx/appcompat/widget/Toolbar;->q:Landroidx/appcompat/widget/ActionMenuView;

    .line 12
    .line 13
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->J:Lm/j;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lm/j;->e()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->W:Lt2/e;

    .line 25
    .line 26
    iget-object p1, p1, Lt2/e;->r:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, LJ1/A;

    .line 45
    .line 46
    iget-object v0, v0, LJ1/A;->a:LJ1/H;

    .line 47
    .line 48
    invoke-virtual {v0}, LJ1/H;->s()Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :goto_1
    return-void

    .line 53
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public j(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public k(Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li1/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo$Builder;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lc4/a;->t(Landroid/view/ContentInfo$Builder;Landroid/net/Uri;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public l(Ll/l;Ll/n;)V
    .locals 10

    .line 1
    iget-object v0, p0, Li1/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll/f;

    .line 4
    .line 5
    iget-object v1, v0, Ll/f;->v:Landroid/os/Handler;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Ll/f;->x:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    :goto_0
    const/4 v5, -0x1

    .line 19
    if-ge v4, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    check-cast v6, Ll/e;

    .line 26
    .line 27
    iget-object v6, v6, Ll/e;->b:Ll/l;

    .line 28
    .line 29
    if-ne p1, v6, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v4, v5

    .line 36
    :goto_1
    if-ne v4, v5, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-ge v4, v3, :cond_3

    .line 46
    .line 47
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    move-object v2, v0

    .line 52
    check-cast v2, Ll/e;

    .line 53
    .line 54
    :cond_3
    move-object v5, v2

    .line 55
    new-instance v3, LO3/B0;

    .line 56
    .line 57
    const/16 v8, 0x9

    .line 58
    .line 59
    const/4 v9, 0x0

    .line 60
    move-object v4, p0

    .line 61
    move-object v7, p1

    .line 62
    move-object v6, p2

    .line 63
    invoke-direct/range {v3 .. v9}, LO3/B0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 64
    .line 65
    .line 66
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 67
    .line 68
    .line 69
    move-result-wide p1

    .line 70
    const-wide/16 v4, 0xc8

    .line 71
    .line 72
    add-long/2addr p1, v4

    .line 73
    invoke-virtual {v1, v3, v7, p1, p2}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public m(IF)V
    .locals 0

    .line 1
    return-void
.end method

.method public n(Ll/l;Landroid/view/MenuItem;)V
    .locals 0

    .line 1
    iget-object p2, p0, Li1/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, Ll/f;

    .line 4
    .line 5
    iget-object p2, p2, Ll/f;->v:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public o(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Li1/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu3/e;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lu3/e;->onConnectionSuspended(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public p(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Li1/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo$Builder;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lc4/a;->s(Landroid/view/ContentInfo$Builder;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public q(Lw/i0;Ljava/lang/Float;Ljava/lang/Float;LB5/c;Lx/g;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/4 p3, 0x0

    .line 10
    const/16 v0, 0x1c

    .line 11
    .line 12
    invoke-static {p3, p2, v0}, Lu/d;->a(FFI)Lu/l;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object p2, p0, Li1/a;->r:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v3, p2

    .line 19
    check-cast v3, Lu/v;

    .line 20
    .line 21
    move-object v0, p1

    .line 22
    move-object v4, p4

    .line 23
    move-object v5, p5

    .line 24
    invoke-static/range {v0 .. v5}, Lx/l;->a(Lw/i0;FLu/l;Lu/v;LB5/c;Ls5/c;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 29
    .line 30
    if-ne p1, p2, :cond_0

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    check-cast p1, Lx/a;

    .line 34
    .line 35
    return-object p1
.end method

.method public r(ILx1/e;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public s(I)Lx1/e;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public setExtras(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li1/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo$Builder;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lc4/a;->u(Landroid/view/ContentInfo$Builder;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public t(I)Lx1/e;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public u()V
    .locals 3

    .line 1
    iget-object v0, p0, Li1/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "input_method"

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-virtual {v1, v0, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public v(FFFF)V
    .locals 9

    .line 1
    iget-object v0, p0, Li1/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LB0/G0;

    .line 4
    .line 5
    invoke-virtual {v0}, LB0/G0;->t()Lj0/m;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, LB0/G0;->E()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    const/16 v4, 0x20

    .line 14
    .line 15
    shr-long/2addr v2, v4

    .line 16
    long-to-int v2, v2

    .line 17
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    add-float/2addr p3, p1

    .line 22
    sub-float/2addr v2, p3

    .line 23
    invoke-virtual {v0}, LB0/G0;->E()J

    .line 24
    .line 25
    .line 26
    move-result-wide v5

    .line 27
    const-wide v7, 0xffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr v5, v7

    .line 33
    long-to-int p3, v5

    .line 34
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    add-float/2addr p4, p2

    .line 39
    sub-float/2addr p3, p4

    .line 40
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 41
    .line 42
    .line 43
    move-result p4

    .line 44
    int-to-long v2, p4

    .line 45
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    int-to-long p3, p3

    .line 50
    shl-long/2addr v2, v4

    .line 51
    and-long/2addr p3, v7

    .line 52
    or-long/2addr p3, v2

    .line 53
    shr-long v2, p3, v4

    .line 54
    .line 55
    long-to-int v2, v2

    .line 56
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    const/4 v3, 0x0

    .line 61
    cmpl-float v2, v2, v3

    .line 62
    .line 63
    if-ltz v2, :cond_0

    .line 64
    .line 65
    and-long v4, p3, v7

    .line 66
    .line 67
    long-to-int v2, v4

    .line 68
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    cmpl-float v2, v2, v3

    .line 73
    .line 74
    if-ltz v2, :cond_0

    .line 75
    .line 76
    const/4 v2, 0x1

    .line 77
    goto :goto_0

    .line 78
    :cond_0
    const/4 v2, 0x0

    .line 79
    :goto_0
    if-nez v2, :cond_1

    .line 80
    .line 81
    const-string v2, "Width and height must be greater than or equal to zero"

    .line 82
    .line 83
    invoke-static {v2}, Lj0/w;->a(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_1
    invoke-virtual {v0, p3, p4}, LB0/G0;->X(J)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v1, p1, p2}, Lj0/m;->h(FF)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public x(IILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public y(FFJ)V
    .locals 5

    .line 1
    iget-object v0, p0, Li1/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LB0/G0;

    .line 4
    .line 5
    invoke-virtual {v0}, LB0/G0;->t()Lj0/m;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/16 v1, 0x20

    .line 10
    .line 11
    shr-long v1, p3, v1

    .line 12
    .line 13
    long-to-int v1, v1

    .line 14
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const-wide v3, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p3, v3

    .line 24
    long-to-int p3, p3

    .line 25
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    invoke-interface {v0, v2, p4}, Lj0/m;->h(FF)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, p1, p2}, Lj0/m;->c(FF)V

    .line 33
    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    neg-float p1, p1

    .line 40
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    neg-float p2, p2

    .line 45
    invoke-interface {v0, p1, p2}, Lj0/m;->h(FF)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public z()V
    .locals 3

    .line 1
    iget-object v0, p0, Li1/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->onCheckIsTextEditor()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 31
    .line 32
    .line 33
    move-object v1, v0

    .line 34
    :goto_1
    if-nez v1, :cond_3

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const v1, 0x1020002

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :cond_3
    if-eqz v1, :cond_4

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/view/View;->hasWindowFocus()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    new-instance v0, Ll4/n;

    .line 56
    .line 57
    const/4 v2, 0x1

    .line 58
    invoke-direct {v0, v1, v2}, Ll4/n;-><init>(Landroid/view/View;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 62
    .line 63
    .line 64
    :cond_4
    :goto_2
    return-void
.end method

.method public zza()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Li1/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LC3/b;

    .line 4
    .line 5
    iget-object v0, v0, LC3/b;->a:Landroid/content/Context;

    .line 6
    .line 7
    return-object v0
.end method
