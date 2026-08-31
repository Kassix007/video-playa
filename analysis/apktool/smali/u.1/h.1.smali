.class public interface abstract Lu/h;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b(J)Ljava/lang/Object;
.end method

.method public abstract c()J
.end method

.method public abstract d()LZ/m;
.end method

.method public abstract e()Ljava/lang/Object;
.end method

.method public abstract f(J)Lu/q;
.end method

.method public g(J)Z
    .locals 2

    .line 1
    invoke-interface {p0}, Lu/h;->c()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    cmp-long p1, p1, v0

    .line 6
    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method
