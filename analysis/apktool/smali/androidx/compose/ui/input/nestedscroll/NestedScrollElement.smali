.class final Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;
.super LB0/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LB0/d0;"
    }
.end annotation


# instance fields
.field public final q:Lu0/a;

.field public final r:Lu0/d;


# direct methods
.method public constructor <init>(Lu0/a;Lu0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->q:Lu0/a;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->r:Lu0/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;

    .line 8
    .line 9
    iget-object v0, p1, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->q:Lu0/a;

    .line 10
    .line 11
    iget-object v2, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->q:Lu0/a;

    .line 12
    .line 13
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    iget-object p1, p1, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->r:Lu0/d;

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->r:Lu0/d;

    .line 23
    .line 24
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_2

    .line 29
    .line 30
    return v1

    .line 31
    :cond_2
    const/4 p1, 0x1

    .line 32
    return p1
.end method

.method public final f()Lc0/l;
    .locals 3

    .line 1
    new-instance v0, Lu0/g;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->q:Lu0/a;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->r:Lu0/d;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lu0/g;-><init>(Lu0/a;Lu0/d;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Lc0/l;)V
    .locals 3

    .line 1
    check-cast p1, Lu0/g;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->q:Lu0/a;

    .line 4
    .line 5
    iput-object v0, p1, Lu0/g;->E:Lu0/a;

    .line 6
    .line 7
    iget-object v0, p1, Lu0/g;->F:Lu0/d;

    .line 8
    .line 9
    iget-object v1, v0, Lu0/d;->a:Lu0/g;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v1, p1, :cond_0

    .line 13
    .line 14
    iput-object v2, v0, Lu0/d;->a:Lu0/g;

    .line 15
    .line 16
    :cond_0
    iget-object v1, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->r:Lu0/d;

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    new-instance v0, Lu0/d;

    .line 21
    .line 22
    invoke-direct {v0}, Lu0/d;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p1, Lu0/g;->F:Lu0/d;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    iput-object v1, p1, Lu0/g;->F:Lu0/d;

    .line 35
    .line 36
    :cond_2
    :goto_0
    iget-boolean v0, p1, Lc0/l;->D:Z

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    iget-object v0, p1, Lu0/g;->F:Lu0/d;

    .line 41
    .line 42
    iput-object p1, v0, Lu0/d;->a:Lu0/g;

    .line 43
    .line 44
    iput-object v2, v0, Lu0/d;->b:Lu0/g;

    .line 45
    .line 46
    iput-object v2, p1, Lu0/g;->G:Lu0/g;

    .line 47
    .line 48
    new-instance v1, LA0/d;

    .line 49
    .line 50
    const/16 v2, 0x1c

    .line 51
    .line 52
    invoke-direct {v1, v2, p1}, LA0/d;-><init>(ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object v1, v0, Lu0/d;->c:Lkotlin/jvm/internal/n;

    .line 56
    .line 57
    invoke-virtual {p1}, Lc0/l;->l0()LM5/w;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, v0, Lu0/d;->d:LM5/w;

    .line 62
    .line 63
    :cond_3
    return-void
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->q:Lu0/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->r:Lu0/d;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    add-int/2addr v0, v1

    .line 20
    return v0
.end method
