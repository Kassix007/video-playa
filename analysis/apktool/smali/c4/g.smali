.class public final Lc4/g;
.super Lw1/Q;
.source "SourceFile"


# instance fields
.field public final s:Landroid/view/View;

.field public t:I

.field public u:I

.field public final v:[I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lw1/Q;-><init>(I)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    new-array v0, v0, [I

    .line 7
    .line 8
    iput-object v0, p0, Lc4/g;->v:[I

    .line 9
    .line 10
    iput-object p1, p0, Lc4/g;->s:Landroid/view/View;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lw1/Z;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc4/g;->s:Landroid/view/View;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc4/g;->s:Landroid/view/View;

    .line 2
    .line 3
    iget-object v1, p0, Lc4/g;->v:[I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    aget v0, v1, v0

    .line 10
    .line 11
    iput v0, p0, Lc4/g;->t:I

    .line 12
    .line 13
    return-void
.end method

.method public final d(Lw1/o0;Ljava/util/List;)Lw1/o0;
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lw1/Z;

    .line 16
    .line 17
    iget-object v1, v0, Lw1/Z;->a:Lw1/Y;

    .line 18
    .line 19
    invoke-virtual {v1}, Lw1/Y;->c()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    and-int/lit8 v1, v1, 0x8

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget p2, p0, Lc4/g;->u:I

    .line 28
    .line 29
    iget-object v0, v0, Lw1/Z;->a:Lw1/Y;

    .line 30
    .line 31
    invoke-virtual {v0}, Lw1/Y;->b()F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-static {v0, p2, v1}, LW3/a;->c(FII)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    int-to-float p2, p2

    .line 41
    iget-object v0, p0, Lc4/g;->s:Landroid/view/View;

    .line 42
    .line 43
    invoke-virtual {v0, p2}, Landroid/view/View;->setTranslationY(F)V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-object p1
.end method

.method public final e(Lv3/l;)Lv3/l;
    .locals 3

    .line 1
    iget-object v0, p0, Lc4/g;->s:Landroid/view/View;

    .line 2
    .line 3
    iget-object v1, p0, Lc4/g;->v:[I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    aget v1, v1, v2

    .line 10
    .line 11
    iget v2, p0, Lc4/g;->t:I

    .line 12
    .line 13
    sub-int/2addr v2, v1

    .line 14
    iput v2, p0, Lc4/g;->u:I

    .line 15
    .line 16
    int-to-float v1, v2

    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 18
    .line 19
    .line 20
    return-object p1
.end method
