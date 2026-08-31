.class public final synthetic LO3/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO3/w;
.implements LP1/b;
.implements Lb2/c;
.implements Ll4/p;
.implements Lj2/c;


# static fields
.field public static final synthetic A:LO3/B;

.field public static final synthetic B:LO3/B;

.field public static final synthetic r:LO3/B;

.field public static final synthetic s:LO3/B;

.field public static final synthetic t:LO3/B;

.field public static final synthetic u:LO3/B;

.field public static final synthetic v:LO3/B;

.field public static final synthetic w:LO3/B;

.field public static final synthetic x:LO3/B;

.field public static final synthetic y:LO3/B;

.field public static final synthetic z:LO3/B;


# instance fields
.field public final synthetic q:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LO3/B;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LO3/B;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LO3/B;->r:LO3/B;

    .line 8
    .line 9
    new-instance v0, LO3/B;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, LO3/B;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, LO3/B;->s:LO3/B;

    .line 16
    .line 17
    new-instance v0, LO3/B;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, LO3/B;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LO3/B;->t:LO3/B;

    .line 24
    .line 25
    new-instance v0, LO3/B;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, LO3/B;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, LO3/B;->u:LO3/B;

    .line 32
    .line 33
    new-instance v0, LO3/B;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, LO3/B;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LO3/B;->v:LO3/B;

    .line 40
    .line 41
    new-instance v0, LO3/B;

    .line 42
    .line 43
    const/4 v1, 0x5

    .line 44
    invoke-direct {v0, v1}, LO3/B;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, LO3/B;->w:LO3/B;

    .line 48
    .line 49
    new-instance v0, LO3/B;

    .line 50
    .line 51
    const/4 v1, 0x6

    .line 52
    invoke-direct {v0, v1}, LO3/B;-><init>(I)V

    .line 53
    .line 54
    .line 55
    sput-object v0, LO3/B;->x:LO3/B;

    .line 56
    .line 57
    new-instance v0, LO3/B;

    .line 58
    .line 59
    const/4 v1, 0x7

    .line 60
    invoke-direct {v0, v1}, LO3/B;-><init>(I)V

    .line 61
    .line 62
    .line 63
    sput-object v0, LO3/B;->y:LO3/B;

    .line 64
    .line 65
    new-instance v0, LO3/B;

    .line 66
    .line 67
    const/16 v1, 0x8

    .line 68
    .line 69
    invoke-direct {v0, v1}, LO3/B;-><init>(I)V

    .line 70
    .line 71
    .line 72
    sput-object v0, LO3/B;->z:LO3/B;

    .line 73
    .line 74
    new-instance v0, LO3/B;

    .line 75
    .line 76
    const/16 v1, 0x9

    .line 77
    .line 78
    invoke-direct {v0, v1}, LO3/B;-><init>(I)V

    .line 79
    .line 80
    .line 81
    sput-object v0, LO3/B;->A:LO3/B;

    .line 82
    .line 83
    new-instance v0, LO3/B;

    .line 84
    .line 85
    const/16 v1, 0xa

    .line 86
    .line 87
    invoke-direct {v0, v1}, LO3/B;-><init>(I)V

    .line 88
    .line 89
    .line 90
    sput-object v0, LO3/B;->B:LO3/B;

    .line 91
    .line 92
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LO3/B;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    const/16 p1, 0x14

    iput p1, p0, LO3/B;->q:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final c(F[F[F)F
    .locals 7

    .line 1
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0}, Ljava/lang/Math;->signum(F)F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1, v0}, Ljava/util/Arrays;->binarySearch([FF)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ltz v2, :cond_0

    .line 14
    .line 15
    aget p0, p2, v2

    .line 16
    .line 17
    mul-float/2addr v1, p0

    .line 18
    return v1

    .line 19
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    neg-int v2, v2

    .line 22
    add-int/lit8 v3, v2, -0x1

    .line 23
    .line 24
    array-length v4, p1

    .line 25
    add-int/lit8 v4, v4, -0x1

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    if-lt v3, v4, :cond_2

    .line 29
    .line 30
    array-length v0, p1

    .line 31
    add-int/lit8 v0, v0, -0x1

    .line 32
    .line 33
    aget v0, p1, v0

    .line 34
    .line 35
    array-length p1, p1

    .line 36
    add-int/lit8 p1, p1, -0x1

    .line 37
    .line 38
    aget p1, p2, p1

    .line 39
    .line 40
    cmpg-float p2, v0, v5

    .line 41
    .line 42
    if-nez p2, :cond_1

    .line 43
    .line 44
    return v5

    .line 45
    :cond_1
    div-float/2addr p1, v0

    .line 46
    mul-float/2addr p1, p0

    .line 47
    return p1

    .line 48
    :cond_2
    const/4 p0, -0x1

    .line 49
    if-ne v3, p0, :cond_3

    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    aget p1, p1, p0

    .line 53
    .line 54
    aget p0, p2, p0

    .line 55
    .line 56
    move p2, p1

    .line 57
    move p1, v5

    .line 58
    move v3, p1

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    aget p0, p1, v3

    .line 61
    .line 62
    aget p1, p1, v2

    .line 63
    .line 64
    aget v3, p2, v3

    .line 65
    .line 66
    aget p2, p2, v2

    .line 67
    .line 68
    move v6, p1

    .line 69
    move p1, p0

    .line 70
    move p0, p2

    .line 71
    move p2, v6

    .line 72
    :goto_0
    cmpg-float v2, p1, p2

    .line 73
    .line 74
    if-nez v2, :cond_4

    .line 75
    .line 76
    move v0, v5

    .line 77
    goto :goto_1

    .line 78
    :cond_4
    sub-float/2addr v0, p1

    .line 79
    sub-float/2addr p2, p1

    .line 80
    div-float/2addr v0, p2

    .line 81
    :goto_1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 82
    .line 83
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-static {v5, p1}, Ljava/lang/Math;->max(FF)F

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    sub-float/2addr p0, v3

    .line 92
    mul-float/2addr p0, p1

    .line 93
    add-float/2addr p0, v3

    .line 94
    mul-float/2addr p0, v1

    .line 95
    return p0
.end method

.method public static d(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    const-string v0, "protocols"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p0, Ljava/lang/Iterable;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v2, v1

    .line 28
    check-cast v2, Ld6/r;

    .line 29
    .line 30
    sget-object v3, Ld6/r;->r:Ld6/r;

    .line 31
    .line 32
    if-eq v2, v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 39
    .line 40
    const/16 v1, 0xa

    .line 41
    .line 42
    invoke-static {v0, v1}, Ln5/m;->c0(Ljava/lang/Iterable;I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const/4 v2, 0x0

    .line 54
    :goto_1
    if-ge v2, v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    check-cast v3, Ld6/r;

    .line 63
    .line 64
    iget-object v3, v3, Ld6/r;->q:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    return-object p0
.end method

.method public static e(Ljava/util/List;)[B
    .locals 5

    .line 1
    const-string v0, "protocols"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lq6/g;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, LO3/B;->d(Ljava/util/List;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    if-ge v2, v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    check-cast v3, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-virtual {v0, v4}, Lq6/g;->e0(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Lq6/g;->i0(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-wide v1, v0, Lq6/g;->r:J

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Lq6/g;->z(J)[B

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public static f(LC3/b;LT1/p;Landroid/os/Bundle;Landroidx/lifecycle/p;LT1/i;)LT1/d;
    .locals 9

    .line 1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v7

    .line 9
    const-string v0, "toString(...)"

    .line 10
    .line 11
    invoke-static {v7, v0}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "destination"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v0, "hostLifecycleState"

    .line 20
    .line 21
    invoke-static {p3, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, LT1/d;

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    move-object v2, p0

    .line 28
    move-object v3, p1

    .line 29
    move-object v4, p2

    .line 30
    move-object v5, p3

    .line 31
    move-object v6, p4

    .line 32
    invoke-direct/range {v1 .. v8}, LT1/d;-><init>(LC3/b;LT1/p;Landroid/os/Bundle;Landroidx/lifecycle/p;LT1/i;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 33
    .line 34
    .line 35
    return-object v1
.end method

.method public static g(Ljava/lang/String;)Lq6/j;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    rem-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    div-int/lit8 v0, v0, 0x2

    .line 14
    .line 15
    new-array v1, v0, [B

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v0, :cond_0

    .line 19
    .line 20
    mul-int/lit8 v3, v2, 0x2

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-static {v4}, Lr6/b;->a(C)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    shl-int/lit8 v4, v4, 0x4

    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-static {v3}, Lr6/b;->a(C)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    add-int/2addr v3, v4

    .line 43
    int-to-byte v3, v3

    .line 44
    aput-byte v3, v1, v2

    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance p0, Lq6/j;

    .line 50
    .line 51
    invoke-direct {p0, v1}, Lq6/j;-><init>([B)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_1
    const-string v0, "Unexpected hex string: "

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v0
.end method

.method public static h(Ljava/lang/String;)Lq6/j;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lq6/j;

    .line 7
    .line 8
    sget-object v1, LJ5/a;->a:Ljava/nio/charset/Charset;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "getBytes(...)"

    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Lq6/j;-><init>([B)V

    .line 20
    .line 21
    .line 22
    iput-object p0, v0, Lq6/j;->s:Ljava/lang/String;

    .line 23
    .line 24
    return-object v0
.end method

.method public static i(FFFF)Landroid/graphics/Path;
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0, p1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2, p3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static l()Z
    .locals 2

    .line 1
    const-string v0, "java.vm.name"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "Dalvik"

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method


# virtual methods
.method public a(Landroid/view/View;Lw1/o0;Ll4/q;)Lw1/o0;
    .locals 5

    .line 1
    iget v0, p3, Ll4/q;->d:I

    .line 2
    .line 3
    invoke-virtual {p2}, Lw1/o0;->a()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/2addr v1, v0

    .line 8
    iput v1, p3, Ll4/q;->d:I

    .line 9
    .line 10
    sget-object v0, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    :goto_0
    invoke-virtual {p2}, Lw1/o0;->b()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p2}, Lw1/o0;->c()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iget v3, p3, Ll4/q;->a:I

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    move v4, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v4, v0

    .line 36
    :goto_1
    add-int/2addr v3, v4

    .line 37
    iput v3, p3, Ll4/q;->a:I

    .line 38
    .line 39
    iget v4, p3, Ll4/q;->c:I

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    move v0, v2

    .line 45
    :goto_2
    add-int/2addr v4, v0

    .line 46
    iput v4, p3, Ll4/q;->c:I

    .line 47
    .line 48
    iget v0, p3, Ll4/q;->b:I

    .line 49
    .line 50
    iget p3, p3, Ll4/q;->d:I

    .line 51
    .line 52
    invoke-virtual {p1, v3, v0, v4, p3}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 53
    .line 54
    .line 55
    return-object p2
.end method

.method public b(Lj2/b;)Lj2/d;
    .locals 6

    .line 1
    new-instance v0, Lk2/g;

    .line 2
    .line 3
    iget-object v1, p1, Lj2/b;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p1, Lj2/b;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p1, Lj2/b;->c:LE/Y;

    .line 8
    .line 9
    iget-boolean v4, p1, Lj2/b;->d:Z

    .line 10
    .line 11
    iget-boolean v5, p1, Lj2/b;->e:Z

    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, Lk2/g;-><init>(Landroid/content/Context;Ljava/lang/String;LE/Y;ZZ)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public j()V
    .locals 0

    .line 1
    return-void
.end method

.method public k(ILjava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public zza()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LO3/B;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/google/android/gms/internal/measurement/k4;->r:Lcom/google/android/gms/internal/measurement/k4;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/k4;->q:LG4/g;

    .line 9
    .line 10
    iget-object v0, v0, LG4/g;->q:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lcom/google/android/gms/internal/measurement/l4;

    .line 13
    .line 14
    sget-object v0, Lcom/google/android/gms/internal/measurement/m4;->a:Lcom/google/android/gms/internal/measurement/T1;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T1;->b()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    new-instance v1, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Ljava/lang/Boolean;-><init>(Z)V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :pswitch_0
    sget-object v0, Lcom/google/android/gms/internal/measurement/M3;->r:Lcom/google/android/gms/internal/measurement/M3;

    .line 33
    .line 34
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/M3;->q:LG4/g;

    .line 35
    .line 36
    iget-object v0, v0, LG4/g;->q:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lcom/google/android/gms/internal/measurement/N3;

    .line 39
    .line 40
    sget-object v0, Lcom/google/android/gms/internal/measurement/O3;->a:Lcom/google/android/gms/internal/measurement/T1;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T1;->b()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    new-instance v1, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-direct {v1, v0}, Ljava/lang/Boolean;-><init>(Z)V

    .line 55
    .line 56
    .line 57
    return-object v1

    .line 58
    :pswitch_1
    sget-object v0, LO3/F;->a:Ljava/util/List;

    .line 59
    .line 60
    sget-object v0, Lcom/google/android/gms/internal/measurement/l3;->r:Lcom/google/android/gms/internal/measurement/l3;

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/l3;->a()Lcom/google/android/gms/internal/measurement/m3;

    .line 63
    .line 64
    .line 65
    sget-object v0, Lcom/google/android/gms/internal/measurement/n3;->n0:Lcom/google/android/gms/internal/measurement/T1;

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T1;->b()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Ljava/lang/Long;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 74
    .line 75
    .line 76
    move-result-wide v0

    .line 77
    long-to-int v0, v0

    .line 78
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0

    .line 83
    :pswitch_2
    sget-object v0, LO3/F;->a:Ljava/util/List;

    .line 84
    .line 85
    sget-object v0, Lcom/google/android/gms/internal/measurement/Y3;->r:Lcom/google/android/gms/internal/measurement/Y3;

    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y3;->b()Lcom/google/android/gms/internal/measurement/Z3;

    .line 88
    .line 89
    .line 90
    sget-object v0, Lcom/google/android/gms/internal/measurement/a4;->d:Lcom/google/android/gms/internal/measurement/T1;

    .line 91
    .line 92
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T1;->b()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    return-object v0

    .line 102
    :pswitch_3
    sget-object v0, LO3/F;->a:Ljava/util/List;

    .line 103
    .line 104
    sget-object v0, Lcom/google/android/gms/internal/measurement/u3;->r:Lcom/google/android/gms/internal/measurement/u3;

    .line 105
    .line 106
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/u3;->q:LG4/g;

    .line 107
    .line 108
    iget-object v0, v0, LG4/g;->q:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Lcom/google/android/gms/internal/measurement/v3;

    .line 111
    .line 112
    sget-object v0, Lcom/google/android/gms/internal/measurement/w3;->a:Lcom/google/android/gms/internal/measurement/T1;

    .line 113
    .line 114
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T1;->b()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    return-object v0

    .line 124
    :pswitch_4
    sget-object v0, LO3/F;->a:Ljava/util/List;

    .line 125
    .line 126
    sget-object v0, Lcom/google/android/gms/internal/measurement/Y3;->r:Lcom/google/android/gms/internal/measurement/Y3;

    .line 127
    .line 128
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y3;->b()Lcom/google/android/gms/internal/measurement/Z3;

    .line 129
    .line 130
    .line 131
    sget-object v0, Lcom/google/android/gms/internal/measurement/a4;->e:Lcom/google/android/gms/internal/measurement/T1;

    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T1;->b()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, Ljava/lang/Boolean;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    return-object v0

    .line 143
    :pswitch_5
    sget-object v0, LO3/F;->a:Ljava/util/List;

    .line 144
    .line 145
    sget-object v0, Lcom/google/android/gms/internal/measurement/Y3;->r:Lcom/google/android/gms/internal/measurement/Y3;

    .line 146
    .line 147
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y3;->b()Lcom/google/android/gms/internal/measurement/Z3;

    .line 148
    .line 149
    .line 150
    sget-object v0, Lcom/google/android/gms/internal/measurement/a4;->g:Lcom/google/android/gms/internal/measurement/T1;

    .line 151
    .line 152
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T1;->b()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    check-cast v0, Ljava/lang/Boolean;

    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    return-object v0

    .line 162
    :pswitch_6
    sget-object v0, LO3/F;->a:Ljava/util/List;

    .line 163
    .line 164
    sget-object v0, Lcom/google/android/gms/internal/measurement/Y3;->r:Lcom/google/android/gms/internal/measurement/Y3;

    .line 165
    .line 166
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y3;->b()Lcom/google/android/gms/internal/measurement/Z3;

    .line 167
    .line 168
    .line 169
    sget-object v0, Lcom/google/android/gms/internal/measurement/a4;->a:Lcom/google/android/gms/internal/measurement/T1;

    .line 170
    .line 171
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T1;->b()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, Ljava/lang/Boolean;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    return-object v0

    .line 181
    :pswitch_7
    sget-object v0, LO3/F;->a:Ljava/util/List;

    .line 182
    .line 183
    sget-object v0, Lcom/google/android/gms/internal/measurement/Y3;->r:Lcom/google/android/gms/internal/measurement/Y3;

    .line 184
    .line 185
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/Y3;->b()Lcom/google/android/gms/internal/measurement/Z3;

    .line 186
    .line 187
    .line 188
    sget-object v0, Lcom/google/android/gms/internal/measurement/a4;->f:Lcom/google/android/gms/internal/measurement/T1;

    .line 189
    .line 190
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T1;->b()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    check-cast v0, Ljava/lang/Boolean;

    .line 195
    .line 196
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    return-object v0

    .line 200
    :pswitch_8
    sget-object v0, LO3/F;->a:Ljava/util/List;

    .line 201
    .line 202
    sget-object v0, Lcom/google/android/gms/internal/measurement/h4;->r:Lcom/google/android/gms/internal/measurement/h4;

    .line 203
    .line 204
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/h4;->q:LG4/g;

    .line 205
    .line 206
    iget-object v0, v0, LG4/g;->q:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v0, Lcom/google/android/gms/internal/measurement/i4;

    .line 209
    .line 210
    sget-object v0, Lcom/google/android/gms/internal/measurement/j4;->a:Lcom/google/android/gms/internal/measurement/T1;

    .line 211
    .line 212
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T1;->b()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    check-cast v0, Ljava/lang/Boolean;

    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    return-object v0

    .line 222
    :pswitch_9
    sget-object v0, LO3/F;->a:Ljava/util/List;

    .line 223
    .line 224
    sget-object v0, Lcom/google/android/gms/internal/measurement/A3;->r:Lcom/google/android/gms/internal/measurement/A3;

    .line 225
    .line 226
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/A3;->q:LG4/g;

    .line 227
    .line 228
    iget-object v0, v0, LG4/g;->q:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v0, Lcom/google/android/gms/internal/measurement/B3;

    .line 231
    .line 232
    sget-object v0, Lcom/google/android/gms/internal/measurement/C3;->a:Lcom/google/android/gms/internal/measurement/T1;

    .line 233
    .line 234
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T1;->b()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    check-cast v0, Ljava/lang/Boolean;

    .line 239
    .line 240
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    return-object v0

    .line 244
    nop

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
