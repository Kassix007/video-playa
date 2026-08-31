.class public final LF/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE/o;


# instance fields
.field public final a:LF/e;


# direct methods
.method public constructor <init>(LF/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF/n;->a:LF/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, LF/n;->a:LF/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LF/e;->l()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final b()I
    .locals 2

    .line 1
    iget-object v0, p0, LF/n;->a:LF/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LF/e;->l()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    invoke-virtual {v0}, LF/N;->k()LF/B;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, LF/B;->a:Ljava/util/List;

    .line 14
    .line 15
    invoke-static {v0}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, LF/l;

    .line 20
    .line 21
    iget v0, v0, LF/l;->a:I

    .line 22
    .line 23
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    return v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, LF/n;->a:LF/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LF/N;->k()LF/B;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, LF/B;->a:Ljava/util/List;

    .line 8
    .line 9
    check-cast v0, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    xor-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    return v0
.end method

.method public final d()I
    .locals 3

    .line 1
    iget-object v0, p0, LF/n;->a:LF/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LF/N;->k()LF/B;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, LF/B;->a:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return v0

    .line 17
    :cond_0
    invoke-virtual {v0}, LF/N;->k()LF/B;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, LQ2/g;->F(LF/B;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0}, LF/N;->k()LF/B;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget v2, v2, LF/B;->b:I

    .line 30
    .line 31
    invoke-virtual {v0}, LF/N;->k()LF/B;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget v0, v0, LF/B;->c:I

    .line 36
    .line 37
    add-int/2addr v2, v0

    .line 38
    const/4 v0, 0x1

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    div-int/2addr v1, v2

    .line 43
    if-ge v1, v0, :cond_2

    .line 44
    .line 45
    :goto_0
    return v0

    .line 46
    :cond_2
    return v1
.end method

.method public final e()I
    .locals 2

    .line 1
    iget-object v0, p0, LF/n;->a:LF/e;

    .line 2
    .line 3
    iget v0, v0, LF/N;->e:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method
