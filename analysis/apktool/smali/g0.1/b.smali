.class public final Lg0/b;
.super Lc0/l;
.source "SourceFile"

# interfaces
.implements LB0/p0;
.implements Lg0/a;
.implements LB0/p;


# instance fields
.field public final E:Lg0/c;

.field public F:Z

.field public final G:Lm0/a;


# direct methods
.method public constructor <init>(Lg0/c;Lm0/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc0/l;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg0/b;->E:Lg0/c;

    .line 5
    .line 6
    iput-object p2, p0, Lg0/b;->G:Lm0/a;

    .line 7
    .line 8
    iput-object p0, p1, Lg0/c;->q:Lg0/a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final E()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lg0/b;->x0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final J(LB0/N;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lg0/b;->F:Z

    .line 2
    .line 3
    iget-object v1, p0, Lg0/b;->E:Lg0/c;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, v1, Lg0/c;->r:Lk3/d;

    .line 9
    .line 10
    new-instance v0, LB0/K;

    .line 11
    .line 12
    const/16 v2, 0xe

    .line 13
    .line 14
    invoke-direct {v0, v2, p0, v1}, LB0/K;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v0}, LB0/g;->r(Lc0/l;LB5/a;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v1, Lg0/c;->r:Lk3/d;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Lg0/b;->F:Z

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string p1, "DrawResult not defined, did you forget to call onDraw?"

    .line 29
    .line 30
    invoke-static {p1}, LC0/S;->i(Ljava/lang/String;)LC2/e;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    throw p1

    .line 35
    :cond_1
    :goto_0
    iget-object v0, v1, Lg0/c;->r:Lk3/d;

    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, v0, Lk3/d;->r:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lkotlin/jvm/internal/n;

    .line 43
    .line 44
    invoke-interface {v0, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lg0/b;->x0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final b()LW0/c;
    .locals 1

    .line 1
    invoke-static {p0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, LB0/L;->N:LW0/c;

    .line 6
    .line 7
    return-object v0
.end method

.method public final d()J
    .locals 2

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {p0, v0}, LB0/g;->s(LB0/m;I)LB0/n0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v0, v0, Lz0/J;->s:J

    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/P1;->d0(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method

.method public final d0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lg0/b;->x0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final getLayoutDirection()LW0/l;
    .locals 1

    .line 1
    invoke-static {p0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, LB0/L;->O:LW0/l;

    .line 6
    .line 7
    return-object v0
.end method

.method public final h0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lg0/b;->x0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final q0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final x0()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lg0/b;->F:Z

    .line 3
    .line 4
    iget-object v0, p0, Lg0/b;->E:Lg0/c;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, v0, Lg0/c;->r:Lk3/d;

    .line 8
    .line 9
    invoke-static {p0}, LB0/g;->l(LB0/p;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
