.class public final La1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/C;


# static fields
.field public static final a:La1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La1/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La1/d;->a:La1/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(LB0/T;Ljava/util/List;J)Lz0/D;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    move-object v1, p2

    .line 11
    check-cast v1, Ljava/util/Collection;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    move v4, v3

    .line 20
    :goto_0
    if-ge v2, v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    check-cast v5, Lz0/B;

    .line 27
    .line 28
    invoke-interface {v5, p3, p4}, Lz0/B;->a(J)Lz0/J;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iget v6, v5, Lz0/J;->q:I

    .line 33
    .line 34
    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    iget v6, v5, Lz0/J;->r:I

    .line 39
    .line 40
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    invoke-static {p3, p4}, LW0/a;->j(J)I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-static {p3, p4}, LW0/a;->i(J)I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    :cond_1
    new-instance p2, LF/y;

    .line 65
    .line 66
    const/4 p3, 0x1

    .line 67
    invoke-direct {p2, p3, v0}, LF/y;-><init>(ILjava/util/ArrayList;)V

    .line 68
    .line 69
    .line 70
    sget-object p3, Ln5/t;->q:Ln5/t;

    .line 71
    .line 72
    invoke-interface {p1, v3, v4, p3, p2}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1
.end method
