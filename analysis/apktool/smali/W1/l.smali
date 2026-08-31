.class public final LW1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LR4/k1;)V
    .locals 5

    iget-object v0, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW1/l;->b:Ljava/lang/Object;

    .line 2
    iget-object v1, p1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 3
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const-string v2, "getDecorView(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, LW1/l;->c:Ljava/lang/Object;

    .line 4
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    const-string v2, "getViewTreeObserver(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, LW1/l;->d:Ljava/lang/Object;

    .line 5
    new-instance v2, LC0/j;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p0}, LC0/j;-><init>(ILjava/lang/Object;)V

    iput-object v2, p0, LW1/l;->e:Ljava/lang/Object;

    .line 6
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3}, LP5/H;->b(Ljava/lang/Object;)LP5/S;

    move-result-object v3

    iput-object v3, p0, LW1/l;->f:Ljava/lang/Object;

    .line 7
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 8
    iget-object v1, p1, LR4/k1;->s:Lj5/c;

    if-eqz v1, :cond_0

    .line 9
    iget-object v1, v1, Lj5/c;->h:Landroidx/lifecycle/J;

    if-eqz v1, :cond_0

    .line 10
    new-instance v2, Lg5/d;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lg5/d;-><init>(LW1/l;I)V

    new-instance v3, LR4/N;

    const/16 v4, 0xa

    invoke-direct {v3, v2, v4}, LR4/N;-><init>(LB5/c;I)V

    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 11
    :cond_0
    iget-object p1, p1, LR4/k1;->s:Lj5/c;

    if-eqz p1, :cond_1

    .line 12
    iget-object p1, p1, Lj5/c;->i:Landroidx/lifecycle/J;

    if-eqz p1, :cond_1

    .line 13
    new-instance v1, Lg5/d;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lg5/d;-><init>(LW1/l;I)V

    new-instance v2, LR4/N;

    const/16 v3, 0xa

    invoke-direct {v2, v1, v3}, LR4/N;-><init>(LB5/c;I)V

    invoke-virtual {p1, v0, v2}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    :cond_1
    return-void
.end method

.method public constructor <init>(LT1/p;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW1/l;->b:Ljava/lang/Object;

    .line 15
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LW1/l;->c:Ljava/lang/Object;

    .line 16
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, LW1/l;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 35
    iput v0, p0, LW1/l;->a:I

    .line 36
    iput-object p1, p0, LW1/l;->b:Ljava/lang/Object;

    .line 37
    invoke-static {}, Lm/r;->a()Lm/r;

    move-result-object p1

    iput-object p1, p0, LW1/l;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ld6/a;Lk3/d;Lh6/h;)V
    .locals 0

    const-string p3, "routeDatabase"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, LW1/l;->b:Ljava/lang/Object;

    .line 19
    iput-object p2, p0, LW1/l;->d:Ljava/lang/Object;

    .line 20
    sget-object p2, Ln5/s;->q:Ln5/s;

    iput-object p2, p0, LW1/l;->e:Ljava/lang/Object;

    .line 21
    iput-object p2, p0, LW1/l;->f:Ljava/lang/Object;

    .line 22
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, LW1/l;->c:Ljava/lang/Object;

    .line 23
    iget-object p2, p1, Ld6/a;->h:Ld6/n;

    .line 24
    const-string p3, "url"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-virtual {p2}, Ld6/n;->g()Ljava/net/URI;

    move-result-object p2

    .line 26
    invoke-virtual {p2}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_0

    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    filled-new-array {p1}, [Ljava/net/Proxy;

    move-result-object p1

    invoke-static {p1}, Le6/b;->i([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    .line 27
    :cond_0
    iget-object p1, p1, Ld6/a;->g:Ljava/net/ProxySelector;

    .line 28
    invoke-virtual {p1, p2}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    move-result-object p1

    .line 29
    move-object p2, p1

    check-cast p2, Ljava/util/Collection;

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    .line 30
    :cond_1
    const-string p2, "proxiesOrNull"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Le6/b;->t(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    .line 31
    :cond_2
    :goto_0
    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    filled-new-array {p1}, [Ljava/net/Proxy;

    move-result-object p1

    invoke-static {p1}, Le6/b;->i([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 32
    :goto_1
    iput-object p1, p0, LW1/l;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 33
    iput p1, p0, LW1/l;->a:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 1
    iget-object v0, p0, LW1/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_6

    .line 10
    .line 11
    iget-object v2, p0, LW1/l;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ld6/h;

    .line 14
    .line 15
    if-eqz v2, :cond_4

    .line 16
    .line 17
    iget-object v2, p0, LW1/l;->f:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Ld6/h;

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    new-instance v2, Ld6/h;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v2, p0, LW1/l;->f:Ljava/lang/Object;

    .line 29
    .line 30
    :cond_0
    iget-object v2, p0, LW1/l;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Ld6/h;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    iput-object v3, v2, Ld6/h;->c:Ljava/lang/Object;

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    iput-boolean v4, v2, Ld6/h;->b:Z

    .line 39
    .line 40
    iput-object v3, v2, Ld6/h;->d:Ljava/io/Serializable;

    .line 41
    .line 42
    iput-boolean v4, v2, Ld6/h;->a:Z

    .line 43
    .line 44
    sget-object v3, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 45
    .line 46
    invoke-static {v0}, Lw1/B;->c(Landroid/view/View;)Landroid/content/res/ColorStateList;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const/4 v4, 0x1

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    iput-boolean v4, v2, Ld6/h;->b:Z

    .line 54
    .line 55
    iput-object v3, v2, Ld6/h;->c:Ljava/lang/Object;

    .line 56
    .line 57
    :cond_1
    invoke-static {v0}, Lw1/B;->d(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-eqz v3, :cond_2

    .line 62
    .line 63
    iput-boolean v4, v2, Ld6/h;->a:Z

    .line 64
    .line 65
    iput-object v3, v2, Ld6/h;->d:Ljava/io/Serializable;

    .line 66
    .line 67
    :cond_2
    iget-boolean v3, v2, Ld6/h;->b:Z

    .line 68
    .line 69
    if-nez v3, :cond_3

    .line 70
    .line 71
    iget-boolean v3, v2, Ld6/h;->a:Z

    .line 72
    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v1, v2, v0}, Lm/r;->e(Landroid/graphics/drawable/Drawable;Ld6/h;[I)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_4
    iget-object v2, p0, LW1/l;->e:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, Ld6/h;

    .line 86
    .line 87
    if-eqz v2, :cond_5

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v1, v2, v0}, Lm/r;->e(Landroid/graphics/drawable/Drawable;Ld6/h;[I)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_5
    iget-object v2, p0, LW1/l;->d:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v2, Ld6/h;

    .line 100
    .line 101
    if-eqz v2, :cond_6

    .line 102
    .line 103
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {v1, v2, v0}, Lm/r;->e(Landroid/graphics/drawable/Drawable;Ld6/h;[I)V

    .line 108
    .line 109
    .line 110
    :cond_6
    return-void
.end method

.method public b()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, LW1/l;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld6/h;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Ld6/h;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public c()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, LW1/l;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld6/h;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Ld6/h;->d:Ljava/io/Serializable;

    .line 8
    .line 9
    check-cast v0, Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public d()Z
    .locals 2

    .line 1
    iget v0, p0, LW1/l;->a:I

    .line 2
    .line 3
    iget-object v1, p0, LW1/l;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, LW1/l;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :goto_0
    const/4 v0, 0x1

    .line 25
    return v0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    return v0
.end method

.method public e(Landroid/util/AttributeSet;I)V
    .locals 9

    .line 1
    iget-object v0, p0, LW1/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v4, Lg/a;->y:[I

    .line 10
    .line 11
    invoke-static {v1, p1, v4, p2}, LB0/G0;->N(Landroid/content/Context;Landroid/util/AttributeSet;[II)LB0/G0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, v1, LB0/G0;->s:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v8, v2

    .line 18
    check-cast v8, Landroid/content/res/TypedArray;

    .line 19
    .line 20
    iget-object v2, p0, LW1/l;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iget-object v5, v1, LB0/G0;->s:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v6, v5

    .line 31
    check-cast v6, Landroid/content/res/TypedArray;

    .line 32
    .line 33
    move-object v5, p1

    .line 34
    move v7, p2

    .line 35
    invoke-static/range {v2 .. v7}, Lw1/K;->l(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    :try_start_0
    invoke-virtual {v8, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    const/4 v2, -0x1

    .line 44
    if-eqz p2, :cond_0

    .line 45
    .line 46
    invoke-virtual {v8, p1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, LW1/l;->a:I

    .line 51
    .line 52
    iget-object p1, p0, LW1/l;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Lm/r;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    iget v3, p0, LW1/l;->a:I

    .line 61
    .line 62
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    :try_start_1
    iget-object v4, p1, Lm/r;->a:Lm/J0;

    .line 64
    .line 65
    invoke-virtual {v4, p2, v3}, Lm/J0;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 66
    .line 67
    .line 68
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 69
    :try_start_2
    monitor-exit p1

    .line 70
    if-eqz p2, :cond_0

    .line 71
    .line 72
    invoke-virtual {p0, p2}, LW1/l;->i(Landroid/content/res/ColorStateList;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    move-object p1, v0

    .line 78
    goto :goto_1

    .line 79
    :catchall_1
    move-exception v0

    .line 80
    move-object p2, v0

    .line 81
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 82
    :try_start_4
    throw p2

    .line 83
    :cond_0
    :goto_0
    const/4 p1, 0x1

    .line 84
    invoke-virtual {v8, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-eqz p2, :cond_1

    .line 89
    .line 90
    invoke-virtual {v1, p1}, LB0/G0;->w(I)Landroid/content/res/ColorStateList;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {v0, p1}, Lw1/B;->i(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 95
    .line 96
    .line 97
    :cond_1
    const/4 p1, 0x2

    .line 98
    invoke-virtual {v8, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-eqz p2, :cond_2

    .line 103
    .line 104
    invoke-virtual {v8, p1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    const/4 p2, 0x0

    .line 109
    invoke-static {p1, p2}, Lm/j0;->b(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {v0, p1}, Lw1/B;->j(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 114
    .line 115
    .line 116
    :cond_2
    invoke-virtual {v1}, LB0/G0;->R()V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :goto_1
    invoke-virtual {v1}, LB0/G0;->R()V

    .line 121
    .line 122
    .line 123
    throw p1
.end method

.method public f(Ljava/lang/String;)LT1/o;
    .locals 8

    .line 1
    const-string v0, "route"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LW1/l;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lm5/o;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {v0}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, LT1/n;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget v1, LT1/p;->u:I

    .line 22
    .line 23
    const-string v1, "android-app://androidx.navigation/"

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const-string v1, "uriString"

    .line 30
    .line 31
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string v1, "parse(...)"

    .line 39
    .line 40
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, LW1/l;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 46
    .line 47
    invoke-virtual {v0, p1, v1}, LT1/n;->d(Landroid/net/Uri;Ljava/util/LinkedHashMap;)Landroid/os/Bundle;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    if-nez v4, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v0, p1}, LT1/n;->b(Landroid/net/Uri;)I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    new-instance v2, LT1/o;

    .line 59
    .line 60
    iget-object p1, p0, LW1/l;->b:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v3, p1

    .line 63
    check-cast v3, LT1/p;

    .line 64
    .line 65
    iget-boolean v5, v0, LT1/n;->l:Z

    .line 66
    .line 67
    const/4 v7, 0x0

    .line 68
    invoke-direct/range {v2 .. v7}, LT1/o;-><init>(LT1/p;Landroid/os/Bundle;ZIZ)V

    .line 69
    .line 70
    .line 71
    return-object v2

    .line 72
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 73
    return-object p1
.end method

.method public g()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, LW1/l;->a:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, LW1/l;->i(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LW1/l;->a()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public h(I)V
    .locals 3

    .line 1
    iput p1, p0, LW1/l;->a:I

    .line 2
    .line 3
    iget-object v0, p0, LW1/l;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lm/r;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, LW1/l;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-object v2, v0, Lm/r;->a:Lm/J0;

    .line 19
    .line 20
    invoke-virtual {v2, v1, p1}, Lm/J0;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 21
    .line 22
    .line 23
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    monitor-exit v0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw p1

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    invoke-virtual {p0, p1}, LW1/l;->i(Landroid/content/res/ColorStateList;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, LW1/l;->a()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public i(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, LW1/l;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ld6/h;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ld6/h;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LW1/l;->d:Ljava/lang/Object;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, LW1/l;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ld6/h;

    .line 19
    .line 20
    iput-object p1, v0, Ld6/h;->c:Ljava/lang/Object;

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, v0, Ld6/h;->b:Z

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, LW1/l;->d:Ljava/lang/Object;

    .line 28
    .line 29
    :goto_0
    invoke-virtual {p0}, LW1/l;->a()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public j(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, LW1/l;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld6/h;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ld6/h;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, LW1/l;->e:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, LW1/l;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ld6/h;

    .line 17
    .line 18
    iput-object p1, v0, Ld6/h;->c:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, v0, Ld6/h;->b:Z

    .line 22
    .line 23
    invoke-virtual {p0}, LW1/l;->a()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public k(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, LW1/l;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld6/h;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ld6/h;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, LW1/l;->e:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, LW1/l;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ld6/h;

    .line 17
    .line 18
    iput-object p1, v0, Ld6/h;->d:Ljava/io/Serializable;

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, v0, Ld6/h;->a:Z

    .line 22
    .line 23
    invoke-virtual {p0}, LW1/l;->a()V

    .line 24
    .line 25
    .line 26
    return-void
.end method
