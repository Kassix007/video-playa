.class public final synthetic LR4/P1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ5/w;


# static fields
.field public static final a:LR4/P1;

.field private static final descriptor:LX5/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LR4/P1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR4/P1;->a:LR4/P1;

    .line 7
    .line 8
    new-instance v1, LZ5/P;

    .line 9
    .line 10
    const-string v2, "com.web2native.Page"

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    invoke-direct {v1, v2, v0, v3}, LZ5/P;-><init>(Ljava/lang/String;LZ5/w;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "elements"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "showSkipButton"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "topMarginPercent"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    sput-object v1, LR4/P1;->descriptor:LX5/f;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a()[LV5/a;
    .locals 5

    .line 1
    sget-object v0, LR4/R1;->d:[Lm5/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    invoke-interface {v0}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, LV5/a;

    .line 11
    .line 12
    invoke-static {v0}, LC3/a;->A(LV5/a;)LV5/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v2, LZ5/f;->a:LZ5/f;

    .line 17
    .line 18
    invoke-static {v2}, LC3/a;->A(LV5/a;)LV5/a;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    sget-object v3, LZ5/C;->a:LZ5/C;

    .line 23
    .line 24
    invoke-static {v3}, LC3/a;->A(LV5/a;)LV5/a;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const/4 v4, 0x3

    .line 29
    new-array v4, v4, [LV5/a;

    .line 30
    .line 31
    aput-object v0, v4, v1

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    aput-object v2, v4, v0

    .line 35
    .line 36
    const/4 v0, 0x2

    .line 37
    aput-object v3, v4, v0

    .line 38
    .line 39
    return-object v4
.end method

.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, LR4/P1;->descriptor:LX5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, LR4/P1;->descriptor:LX5/f;

    .line 2
    .line 3
    invoke-interface {p1, v0}, LY5/b;->a(LX5/f;)LY5/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v1, LR4/R1;->d:[Lm5/h;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    move v7, v2

    .line 13
    move v8, v3

    .line 14
    move-object v5, v4

    .line 15
    move-object v6, v5

    .line 16
    :goto_0
    if-eqz v7, :cond_4

    .line 17
    .line 18
    invoke-interface {p1, v0}, LY5/a;->j(LX5/f;)I

    .line 19
    .line 20
    .line 21
    move-result v9

    .line 22
    const/4 v10, -0x1

    .line 23
    if-eq v9, v10, :cond_3

    .line 24
    .line 25
    if-eqz v9, :cond_2

    .line 26
    .line 27
    if-eq v9, v2, :cond_1

    .line 28
    .line 29
    const/4 v10, 0x2

    .line 30
    if-ne v9, v10, :cond_0

    .line 31
    .line 32
    sget-object v9, LZ5/C;->a:LZ5/C;

    .line 33
    .line 34
    invoke-interface {p1, v0, v10, v9, v6}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    check-cast v6, Ljava/lang/Integer;

    .line 39
    .line 40
    or-int/lit8 v8, v8, 0x4

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance p1, LV5/e;

    .line 44
    .line 45
    invoke-direct {p1, v9}, LV5/e;-><init>(I)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_1
    sget-object v9, LZ5/f;->a:LZ5/f;

    .line 50
    .line 51
    invoke-interface {p1, v0, v2, v9, v5}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    check-cast v5, Ljava/lang/Boolean;

    .line 56
    .line 57
    or-int/lit8 v8, v8, 0x2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    aget-object v9, v1, v3

    .line 61
    .line 62
    invoke-interface {v9}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    check-cast v9, LV5/a;

    .line 67
    .line 68
    invoke-interface {p1, v0, v3, v9, v4}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Ljava/util/List;

    .line 73
    .line 74
    or-int/lit8 v8, v8, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    move v7, v3

    .line 78
    goto :goto_0

    .line 79
    :cond_4
    invoke-interface {p1, v0}, LY5/a;->l(LX5/f;)V

    .line 80
    .line 81
    .line 82
    new-instance p1, LR4/R1;

    .line 83
    .line 84
    invoke-direct {p1, v8, v4, v5, v6}, LR4/R1;-><init>(ILjava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;)V

    .line 85
    .line 86
    .line 87
    return-object p1
.end method
