.class public interface abstract Lc0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(LB5/c;)Z
.end method

.method public abstract b(Ljava/lang/Object;LB5/e;)Ljava/lang/Object;
.end method

.method public d(Lc0/m;)Lc0/m;
    .locals 1

    .line 1
    sget-object v0, Lc0/j;->q:Lc0/j;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lc0/g;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lc0/g;-><init>(Lc0/m;Lc0/m;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
