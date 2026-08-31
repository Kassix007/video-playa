.class public abstract Landroidx/compose/ui/graphics/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lc0/m;LB5/c;)Lc0/m;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;-><init>(LB5/c;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static b(Lc0/m;FLj0/E;ZI)Lc0/m;
    .locals 14

    .line 1
    move/from16 v0, p4

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x4

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/high16 v1, 0x3f800000    # 1.0f

    .line 9
    .line 10
    move v4, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v4, v2

    .line 13
    :goto_0
    and-int/lit8 v1, v0, 0x20

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    move v5, v2

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move v5, p1

    .line 20
    :goto_1
    sget-wide v6, Lj0/H;->b:J

    .line 21
    .line 22
    and-int/lit16 p1, v0, 0x800

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    sget-object p1, Lj0/B;->a:LO3/D;

    .line 27
    .line 28
    move-object v8, p1

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    move-object/from16 v8, p2

    .line 31
    .line 32
    :goto_2
    and-int/lit16 p1, v0, 0x1000

    .line 33
    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    move v9, p1

    .line 38
    goto :goto_3

    .line 39
    :cond_3
    move/from16 v9, p3

    .line 40
    .line 41
    :goto_3
    sget-wide v10, Lj0/u;->a:J

    .line 42
    .line 43
    new-instance v3, Landroidx/compose/ui/graphics/GraphicsLayerElement;

    .line 44
    .line 45
    move-wide v12, v10

    .line 46
    invoke-direct/range {v3 .. v13}, Landroidx/compose/ui/graphics/GraphicsLayerElement;-><init>(FFJLj0/E;ZJJ)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p0, v3}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method
