.class public abstract Lkotlin/jvm/internal/r;
.super Lkotlin/jvm/internal/t;
.source "SourceFile"

# interfaces
.implements LH5/j;


# virtual methods
.method public computeReflected()LH5/b;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/jvm/internal/z;->a:Lkotlin/jvm/internal/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public getDelegate(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/t;->getReflected()LH5/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LH5/j;

    .line 6
    .line 7
    invoke-interface {v0, p1}, LH5/j;->getDelegate(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public bridge synthetic getGetter()LH5/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/r;->getGetter()LH5/i;

    const/4 v0, 0x0

    return-object v0
.end method

.method public getGetter()LH5/i;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/jvm/internal/t;->getReflected()LH5/k;

    move-result-object v0

    check-cast v0, LH5/j;

    invoke-interface {v0}, LH5/j;->getGetter()LH5/i;

    const/4 v0, 0x0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, LH5/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
