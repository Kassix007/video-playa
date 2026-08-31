.class public final Lv/B;
.super Lc0/l;
.source "SourceFile"

# interfaces
.implements LB0/p;


# instance fields
.field public final E:Ly/i;

.field public F:Z

.field public G:Z

.field public H:Z


# direct methods
.method public constructor <init>(Ly/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc0/l;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv/B;->E:Ly/i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final J(LB0/N;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, LB0/N;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v1, p1, LB0/N;->q:Ll0/b;

    .line 5
    .line 6
    iget-boolean v2, p0, Lv/B;->F:Z

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    sget-wide v2, Lj0/o;->b:J

    .line 11
    .line 12
    const v4, 0x3e99999a    # 0.3f

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3, v4}, Lj0/o;->b(JF)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    invoke-interface {v1}, Ll0/d;->d()J

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    const/4 v7, 0x0

    .line 24
    const/16 v8, 0x7a

    .line 25
    .line 26
    move-wide v1, v2

    .line 27
    const-wide/16 v3, 0x0

    .line 28
    .line 29
    move-object v0, p1

    .line 30
    invoke-static/range {v0 .. v8}, Ll0/d;->g0(Ll0/d;JJJFI)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    iget-boolean v0, p0, Lv/B;->G:Z

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    iget-boolean v0, p0, Lv/B;->H:Z

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return-void

    .line 44
    :cond_2
    :goto_0
    sget-wide v2, Lj0/o;->b:J

    .line 45
    .line 46
    const v0, 0x3dcccccd    # 0.1f

    .line 47
    .line 48
    .line 49
    invoke-static {v2, v3, v0}, Lj0/o;->b(JF)J

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    invoke-interface {v1}, Ll0/d;->d()J

    .line 54
    .line 55
    .line 56
    move-result-wide v5

    .line 57
    const/4 v7, 0x0

    .line 58
    const/16 v8, 0x7a

    .line 59
    .line 60
    move-wide v1, v2

    .line 61
    const-wide/16 v3, 0x0

    .line 62
    .line 63
    move-object v0, p1

    .line 64
    invoke-static/range {v0 .. v8}, Ll0/d;->g0(Ll0/d;JJJFI)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final p0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lc0/l;->l0()LM5/w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lv/A;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lv/A;-><init>(Lv/B;Lq5/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    invoke-static {v0, v2, v2, v1, v3}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 13
    .line 14
    .line 15
    return-void
.end method
