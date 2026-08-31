.class public final Lh3/b;
.super LO3/D0;
.source "SourceFile"


# virtual methods
.method public final bridge synthetic f()Ld3/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh3/b;->p()Ld3/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final p()Ld3/i;
    .locals 2

    .line 1
    new-instance v0, Ld3/i;

    .line 2
    .line 3
    iget-object v1, p0, LO3/D0;->r:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ld3/e;-><init>(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
