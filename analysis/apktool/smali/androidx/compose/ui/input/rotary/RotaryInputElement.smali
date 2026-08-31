.class final Landroidx/compose/ui/input/rotary/RotaryInputElement;
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
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Landroidx/compose/ui/input/rotary/RotaryInputElement;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Landroidx/compose/ui/input/rotary/RotaryInputElement;

    .line 10
    .line 11
    sget-object v0, LC0/p;->t:LC0/p;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_2

    .line 21
    .line 22
    :goto_0
    const/4 p1, 0x0

    .line 23
    return p1

    .line 24
    :cond_2
    :goto_1
    const/4 p1, 0x1

    .line 25
    return p1
.end method

.method public final f()Lc0/l;
    .locals 2

    .line 1
    new-instance v0, Lx0/a;

    .line 2
    .line 3
    sget-object v1, LC0/p;->t:LC0/p;

    .line 4
    .line 5
    invoke-direct {v0}, Lc0/l;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, Lx0/a;->E:LC0/p;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Lc0/l;)V
    .locals 1

    .line 1
    check-cast p1, Lx0/a;

    .line 2
    .line 3
    sget-object v0, LC0/p;->t:LC0/p;

    .line 4
    .line 5
    iput-object v0, p1, Lx0/a;->E:LC0/p;

    .line 6
    .line 7
    return-void
.end method

.method public final hashCode()I
    .locals 1

    sget-object v0, LC0/p;->t:LC0/p;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RotaryInputElement(onRotaryScrollEvent="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, LC0/p;->t:LC0/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onPreRotaryScrollEvent=null)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
