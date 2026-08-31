.class public final synthetic LR4/u2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ5/w;


# static fields
.field public static final a:LR4/u2;

.field private static final descriptor:LX5/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LR4/u2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR4/u2;->a:LR4/u2;

    .line 7
    .line 8
    new-instance v1, LZ5/P;

    .line 9
    .line 10
    const-string v2, "com.web2native.SecondaryFooterData"

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v1, v2, v0, v3}, LZ5/P;-><init>(Ljava/lang/String;LZ5/w;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "menus"

    .line 17
    .line 18
    invoke-virtual {v1, v0, v3}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    sput-object v1, LR4/u2;->descriptor:LX5/f;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a()[LV5/a;
    .locals 3

    .line 1
    sget-object v0, LR4/w2;->b:[Lm5/h;

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
    const/4 v2, 0x1

    .line 17
    new-array v2, v2, [LV5/a;

    .line 18
    .line 19
    aput-object v0, v2, v1

    .line 20
    .line 21
    return-object v2
.end method

.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, LR4/u2;->descriptor:LX5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, LR4/u2;->descriptor:LX5/f;

    .line 2
    .line 3
    invoke-interface {p1, v0}, LY5/b;->a(LX5/f;)LY5/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v1, LR4/w2;->b:[Lm5/h;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    move v5, v2

    .line 13
    move v6, v3

    .line 14
    :goto_0
    if-eqz v5, :cond_2

    .line 15
    .line 16
    invoke-interface {p1, v0}, LY5/a;->j(LX5/f;)I

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    const/4 v8, -0x1

    .line 21
    if-eq v7, v8, :cond_1

    .line 22
    .line 23
    if-nez v7, :cond_0

    .line 24
    .line 25
    aget-object v6, v1, v3

    .line 26
    .line 27
    invoke-interface {v6}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    check-cast v6, LV5/a;

    .line 32
    .line 33
    invoke-interface {p1, v0, v3, v6, v4}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Ljava/util/List;

    .line 38
    .line 39
    move v6, v2

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p1, LV5/e;

    .line 42
    .line 43
    invoke-direct {p1, v7}, LV5/e;-><init>(I)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_1
    move v5, v3

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-interface {p1, v0}, LY5/a;->l(LX5/f;)V

    .line 50
    .line 51
    .line 52
    new-instance p1, LR4/w2;

    .line 53
    .line 54
    invoke-direct {p1, v6, v4}, LR4/w2;-><init>(ILjava/util/List;)V

    .line 55
    .line 56
    .line 57
    return-object p1
.end method
