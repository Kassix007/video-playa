.class public final Landroidx/room/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/room/n;

.field public final b:[I

.field public final c:[Ljava/lang/String;

.field public final d:Ljava/util/Set;


# direct methods
.method public constructor <init>(Landroidx/room/n;[I[Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/room/o;->a:Landroidx/room/n;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/room/o;->b:[I

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/room/o;->c:[Ljava/lang/String;

    .line 9
    .line 10
    array-length p1, p3

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    sget-object p1, Ln5/u;->q:Ln5/u;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    aget-object p1, p3, p1

    .line 18
    .line 19
    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, "singleton(...)"

    .line 24
    .line 25
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iput-object p1, p0, Landroidx/room/o;->d:Ljava/util/Set;

    .line 29
    .line 30
    array-length p1, p2

    .line 31
    array-length p2, p3

    .line 32
    if-ne p1, p2, :cond_1

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    const-string p2, "Check failed."

    .line 38
    .line 39
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1
.end method


# virtual methods
.method public final a(Ljava/util/Set;)V
    .locals 7

    .line 1
    const-string v0, "invalidatedTablesIds"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/room/o;->b:[I

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    sget-object v2, Ln5/u;->q:Ln5/u;

    .line 10
    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    if-eq v1, v4, :cond_2

    .line 16
    .line 17
    new-instance v1, Lo5/g;

    .line 18
    .line 19
    invoke-direct {v1}, Lo5/g;-><init>()V

    .line 20
    .line 21
    .line 22
    array-length v2, v0

    .line 23
    move v4, v3

    .line 24
    :goto_0
    if-ge v3, v2, :cond_1

    .line 25
    .line 26
    aget v5, v0, v3

    .line 27
    .line 28
    add-int/lit8 v6, v4, 0x1

    .line 29
    .line 30
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-interface {p1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    iget-object v5, p0, Landroidx/room/o;->c:[Ljava/lang/String;

    .line 41
    .line 42
    aget-object v4, v5, v4

    .line 43
    .line 44
    invoke-virtual {v1, v4}, Lo5/g;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    move v4, v6

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {v1}, Ln5/A;->m(Lo5/g;)Lo5/g;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    aget v0, v0, v3

    .line 57
    .line 58
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    iget-object v2, p0, Landroidx/room/o;->d:Ljava/util/Set;

    .line 69
    .line 70
    :cond_3
    :goto_1
    move-object p1, v2

    .line 71
    check-cast p1, Ljava/util/Collection;

    .line 72
    .line 73
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-nez p1, :cond_4

    .line 78
    .line 79
    iget-object p1, p0, Landroidx/room/o;->a:Landroidx/room/n;

    .line 80
    .line 81
    invoke-virtual {p1, v2}, Landroidx/room/n;->a(Ljava/util/Set;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    return-void
.end method
