.class public abstract LE5/a;
.super LE5/c;
.source "SourceFile"


# virtual methods
.method public final a(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LE5/a;->b()Ljava/util/Random;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Ljava/util/Random;->nextInt(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public abstract b()Ljava/util/Random;
.end method
