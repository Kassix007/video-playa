.class public final LP/m;
.super LP/r;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:Z

.field public d:Ljava/util/HashSet;

.field public final e:Ljava/util/LinkedHashSet;

.field public final f:LP/f0;

.field public final synthetic g:LP/o;


# direct methods
.method public constructor <init>(LP/o;IZZLP/S;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP/m;->g:LP/o;

    .line 5
    .line 6
    iput p2, p0, LP/m;->a:I

    .line 7
    .line 8
    iput-boolean p3, p0, LP/m;->b:Z

    .line 9
    .line 10
    iput-boolean p4, p0, LP/m;->c:Z

    .line 11
    .line 12
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, LP/m;->e:Ljava/util/LinkedHashSet;

    .line 18
    .line 19
    sget-object p1, LX/i;->t:LX/i;

    .line 20
    .line 21
    sget-object p2, LP/S;->t:LP/S;

    .line 22
    .line 23
    new-instance p3, LP/f0;

    .line 24
    .line 25
    invoke-direct {p3, p1, p2}, LP/f0;-><init>(Ljava/lang/Object;LP/I0;)V

    .line 26
    .line 27
    .line 28
    iput-object p3, p0, LP/m;->f:LP/f0;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a(LP/u;LX/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, LP/m;->g:LP/o;

    .line 2
    .line 3
    iget-object v0, v0, LP/o;->b:LP/r;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, LP/r;->a(LP/u;LX/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, LP/m;->g:LP/o;

    .line 2
    .line 3
    iget v1, v0, LP/o;->z:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, -0x1

    .line 6
    .line 7
    iput v1, v0, LP/o;->z:I

    .line 8
    .line 9
    return-void
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, LP/m;->g:LP/o;

    .line 2
    .line 3
    iget-object v0, v0, LP/o;->b:LP/r;

    .line 4
    .line 5
    invoke-virtual {v0}, LP/r;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LP/m;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LP/m;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final f()LP/i0;
    .locals 1

    .line 1
    iget-object v0, p0, LP/m;->f:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LP/i0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, LP/m;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()Lq5/h;
    .locals 1

    .line 1
    iget-object v0, p0, LP/m;->g:LP/o;

    .line 2
    .line 3
    iget-object v0, v0, LP/o;->b:LP/r;

    .line 4
    .line 5
    invoke-virtual {v0}, LP/r;->h()Lq5/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final i(LP/u;)V
    .locals 3

    .line 1
    iget-object v0, p0, LP/m;->g:LP/o;

    .line 2
    .line 3
    iget-object v1, v0, LP/o;->b:LP/r;

    .line 4
    .line 5
    iget-object v2, v0, LP/o;->g:LP/u;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, LP/r;->i(LP/u;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, LP/o;->b:LP/r;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, LP/r;->i(LP/u;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final j(LP/V;)LP/U;
    .locals 1

    .line 1
    iget-object v0, p0, LP/m;->g:LP/o;

    .line 2
    .line 3
    iget-object v0, v0, LP/o;->b:LP/r;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LP/r;->j(LP/V;)LP/U;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final k(Ljava/util/Set;)V
    .locals 1

    .line 1
    iget-object v0, p0, LP/m;->d:Ljava/util/HashSet;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LP/m;->d:Ljava/util/HashSet;

    .line 11
    .line 12
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final l(LP/o;)V
    .locals 1

    .line 1
    iget-object v0, p0, LP/m;->e:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final m(LP/u;)V
    .locals 1

    .line 1
    iget-object v0, p0, LP/m;->g:LP/o;

    .line 2
    .line 3
    iget-object v0, v0, LP/o;->b:LP/r;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LP/r;->m(LP/u;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final n()V
    .locals 2

    .line 1
    iget-object v0, p0, LP/m;->g:LP/o;

    .line 2
    .line 3
    iget v1, v0, LP/o;->z:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x1

    .line 6
    .line 7
    iput v1, v0, LP/o;->z:I

    .line 8
    .line 9
    return-void
.end method

.method public final o(LP/o;)V
    .locals 3

    .line 1
    iget-object v0, p0, LP/m;->d:Ljava/util/HashSet;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/util/Set;

    .line 20
    .line 21
    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl"

    .line 22
    .line 23
    invoke-static {p1, v2}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, p1, LP/o;->c:LP/A0;

    .line 27
    .line 28
    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v0, p0, LP/m;->e:Ljava/util/LinkedHashSet;

    .line 33
    .line 34
    instance-of v1, v0, LC5/a;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    instance-of v1, v0, LC5/b;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p1, "kotlin.collections.MutableCollection"

    .line 44
    .line 45
    invoke-static {v0, p1}, Lkotlin/jvm/internal/B;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    throw p1

    .line 50
    :cond_2
    :goto_1
    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final p(LP/u;)V
    .locals 1

    .line 1
    iget-object v0, p0, LP/m;->g:LP/o;

    .line 2
    .line 3
    iget-object v0, v0, LP/o;->b:LP/r;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LP/r;->p(LP/u;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final q()V
    .locals 7

    .line 1
    iget-object v0, p0, LP/m;->e:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_2

    .line 8
    .line 9
    iget-object v1, p0, LP/m;->d:Ljava/util/HashSet;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, LP/o;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, Ljava/util/Set;

    .line 44
    .line 45
    iget-object v6, v3, LP/o;->c:LP/A0;

    .line 46
    .line 47
    invoke-interface {v5, v6}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void
.end method
