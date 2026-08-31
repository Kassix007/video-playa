.class public final LB0/m0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:LB0/n0;

.field public final synthetic r:Lc0/l;

.field public final synthetic s:LB0/e;

.field public final synthetic t:J

.field public final synthetic u:LB0/t;

.field public final synthetic v:I

.field public final synthetic w:Z

.field public final synthetic x:F


# direct methods
.method public constructor <init>(LB0/n0;Lc0/l;LB0/e;JLB0/t;IZF)V
    .locals 0

    .line 1
    iput-object p1, p0, LB0/m0;->q:LB0/n0;

    .line 2
    .line 3
    iput-object p2, p0, LB0/m0;->r:Lc0/l;

    .line 4
    .line 5
    iput-object p3, p0, LB0/m0;->s:LB0/e;

    .line 6
    .line 7
    iput-wide p4, p0, LB0/m0;->t:J

    .line 8
    .line 9
    iput-object p6, p0, LB0/m0;->u:LB0/t;

    .line 10
    .line 11
    iput p7, p0, LB0/m0;->v:I

    .line 12
    .line 13
    iput-boolean p8, p0, LB0/m0;->w:Z

    .line 14
    .line 15
    iput p9, p0, LB0/m0;->x:F

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, LB0/m0;->s:LB0/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LB0/e;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, LB0/m0;->r:Lc0/l;

    .line 8
    .line 9
    invoke-static {v1, v0}, LB0/g;->e(LB0/m;I)Lc0/l;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget v10, p0, LB0/m0;->x:F

    .line 14
    .line 15
    const/4 v11, 0x0

    .line 16
    iget-object v2, p0, LB0/m0;->q:LB0/n0;

    .line 17
    .line 18
    iget-object v4, p0, LB0/m0;->s:LB0/e;

    .line 19
    .line 20
    iget-wide v5, p0, LB0/m0;->t:J

    .line 21
    .line 22
    iget-object v7, p0, LB0/m0;->u:LB0/t;

    .line 23
    .line 24
    iget v8, p0, LB0/m0;->v:I

    .line 25
    .line 26
    iget-boolean v9, p0, LB0/m0;->w:Z

    .line 27
    .line 28
    invoke-virtual/range {v2 .. v11}, LB0/n0;->P0(Lc0/l;LB0/e;JLB0/t;IZFZ)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 32
    .line 33
    return-object v0
.end method
