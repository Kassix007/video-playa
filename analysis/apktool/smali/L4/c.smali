.class public final LL4/c;
.super LK4/d;
.source "SourceFile"


# instance fields
.field public final H:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LK4/d;-><init>(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LL4/c;->H:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LL4/c;->H:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    move-object v4, v3

    .line 22
    check-cast v4, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;

    .line 23
    .line 24
    iget-object v8, p0, LK4/d;->e:LK4/b;

    .line 25
    .line 26
    iget-object v9, p0, LK4/d;->d:LK4/b;

    .line 27
    .line 28
    iget-object v6, p0, LK4/d;->c:LK4/b;

    .line 29
    .line 30
    iget-object v7, p0, LK4/d;->f:LK4/b;

    .line 31
    .line 32
    move-object v5, p1

    .line 33
    invoke-virtual/range {v4 .. v9}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->processPreDraw(Landroid/graphics/Canvas;LK4/b;LK4/b;LK4/b;LK4/b;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v5, p1

    .line 38
    invoke-super {p0, v5}, LK4/d;->draw(Landroid/graphics/Canvas;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Ln5/l;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Ljava/lang/Iterable;

    .line 46
    .line 47
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;

    .line 62
    .line 63
    invoke-virtual {v0, v5}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->processPostDraw(Landroid/graphics/Canvas;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    return-void
.end method
