.class public final Landroidx/compose/foundation/layout/HorizontalAlignElement;
.super LB0/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LB0/d0;"
    }
.end annotation


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p1, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 p1, 0x0

    .line 13
    :goto_0
    if-nez p1, :cond_2

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    :cond_2
    sget-object p1, Lc0/b;->C:Lc0/c;

    .line 18
    .line 19
    invoke-virtual {p1, p1}, Lc0/c;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1
.end method

.method public final f()Lc0/l;
    .locals 2

    .line 1
    new-instance v0, LA/C;

    .line 2
    .line 3
    sget-object v1, Lc0/b;->C:Lc0/c;

    .line 4
    .line 5
    invoke-direct {v0}, Lc0/l;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, LA/C;->E:Lc0/c;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Lc0/l;)V
    .locals 1

    .line 1
    check-cast p1, LA/C;

    .line 2
    .line 3
    sget-object v0, Lc0/b;->C:Lc0/c;

    .line 4
    .line 5
    iput-object v0, p1, LA/C;->E:Lc0/c;

    .line 6
    .line 7
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    return v0
.end method
