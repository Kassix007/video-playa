.class public interface abstract LC0/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public a()F
    .locals 1

    .line 1
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 2
    .line 3
    .line 4
    return v0
.end method

.method public abstract b()J
.end method

.method public abstract c()F
.end method

.method public d()J
    .locals 7

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    int-to-long v1, v1

    .line 9
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-long v3, v0

    .line 14
    const/16 v0, 0x20

    .line 15
    .line 16
    shl-long v0, v1, v0

    .line 17
    .line 18
    const-wide v5, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long v2, v3, v5

    .line 24
    .line 25
    or-long/2addr v0, v2

    .line 26
    return-wide v0
.end method
