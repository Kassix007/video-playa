.class public abstract Lv/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LP/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lv/r;->t:Lv/r;

    .line 2
    .line 3
    new-instance v1, LP/z;

    .line 4
    .line 5
    invoke-direct {v1, v0}, LP/z;-><init>(LB5/c;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, Lv/d0;->a:LP/z;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(LP/o;)Lv/l;
    .locals 10

    .line 1
    const v0, 0x10dd5ab0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, LP/o;->S(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lv/d0;->a:LP/z;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lv/m;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v1}, LP/o;->p(Z)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_0
    invoke-virtual {p0, v0}, LP/o;->g(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {p0}, LP/o;->H()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    sget-object v2, LP/k;->a:LP/S;

    .line 34
    .line 35
    if-ne v3, v2, :cond_2

    .line 36
    .line 37
    :cond_1
    new-instance v4, Lv/l;

    .line 38
    .line 39
    iget-object v5, v0, Lv/m;->a:Landroid/content/Context;

    .line 40
    .line 41
    iget-object v6, v0, Lv/m;->b:LW0/c;

    .line 42
    .line 43
    iget-wide v7, v0, Lv/m;->c:J

    .line 44
    .line 45
    iget-object v9, v0, Lv/m;->d:LA/L;

    .line 46
    .line 47
    invoke-direct/range {v4 .. v9}, Lv/l;-><init>(Landroid/content/Context;LW0/c;JLA/L;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v4}, LP/o;->d0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move-object v3, v4

    .line 54
    :cond_2
    check-cast v3, Lv/l;

    .line 55
    .line 56
    invoke-virtual {p0, v1}, LP/o;->p(Z)V

    .line 57
    .line 58
    .line 59
    return-object v3
.end method
