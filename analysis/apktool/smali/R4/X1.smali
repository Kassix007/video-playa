.class public final LR4/X1;
.super Lo2/m;
.source "SourceFile"


# instance fields
.field public e0:LR4/W1;


# virtual methods
.method public final c()Z
    .locals 3

    .line 1
    iget-object v0, p0, LR4/X1;->e0:LR4/W1;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Lk3/c;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :try_start_0
    iget-object v0, v0, Lk3/c;->q:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, LR4/k1;

    .line 14
    .line 15
    iget-object v0, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 20
    .line 21
    .line 22
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v0, v1

    .line 25
    :goto_0
    if-lez v0, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    :catch_0
    :cond_1
    return v1

    .line 29
    :cond_2
    iget-object v0, p0, Lo2/m;->q:Landroid/view/View;

    .line 30
    .line 31
    instance-of v1, v0, Landroid/widget/ListView;

    .line 32
    .line 33
    const/4 v2, -0x1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    check-cast v0, Landroid/widget/ListView;

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->canScrollList(I)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    return v0

    .line 43
    :cond_3
    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    return v0
.end method

.method public final setCanChildScrollUpCallback(LR4/W1;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR4/X1;->e0:LR4/W1;

    .line 2
    .line 3
    return-void
.end method
