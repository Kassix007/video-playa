.class public final LM/V;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic A:LB5/e;

.field public final synthetic B:LM/h0;

.field public final synthetic C:LX/e;

.field public final synthetic D:I

.field public final synthetic E:I

.field public final synthetic q:LB5/a;

.field public final synthetic r:Lc0/m;

.field public final synthetic s:LM/I0;

.field public final synthetic t:F

.field public final synthetic u:Lj0/E;

.field public final synthetic v:J

.field public final synthetic w:J

.field public final synthetic x:F

.field public final synthetic y:J

.field public final synthetic z:LB5/e;


# direct methods
.method public constructor <init>(LB5/a;Lc0/m;LM/I0;FLj0/E;JJFJLB5/e;LB5/e;LM/h0;LX/e;II)V
    .locals 0

    .line 1
    iput-object p1, p0, LM/V;->q:LB5/a;

    .line 2
    .line 3
    iput-object p2, p0, LM/V;->r:Lc0/m;

    .line 4
    .line 5
    iput-object p3, p0, LM/V;->s:LM/I0;

    .line 6
    .line 7
    iput p4, p0, LM/V;->t:F

    .line 8
    .line 9
    iput-object p5, p0, LM/V;->u:Lj0/E;

    .line 10
    .line 11
    iput-wide p6, p0, LM/V;->v:J

    .line 12
    .line 13
    iput-wide p8, p0, LM/V;->w:J

    .line 14
    .line 15
    iput p10, p0, LM/V;->x:F

    .line 16
    .line 17
    iput-wide p11, p0, LM/V;->y:J

    .line 18
    .line 19
    iput-object p13, p0, LM/V;->z:LB5/e;

    .line 20
    .line 21
    iput-object p14, p0, LM/V;->A:LB5/e;

    .line 22
    .line 23
    iput-object p15, p0, LM/V;->B:LM/h0;

    .line 24
    .line 25
    move-object/from16 p1, p16

    .line 26
    .line 27
    iput-object p1, p0, LM/V;->C:LX/e;

    .line 28
    .line 29
    move/from16 p1, p17

    .line 30
    .line 31
    iput p1, p0, LM/V;->D:I

    .line 32
    .line 33
    move/from16 p1, p18

    .line 34
    .line 35
    iput p1, p0, LM/V;->E:I

    .line 36
    .line 37
    const/4 p1, 0x2

    .line 38
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v17, p1

    .line 4
    .line 5
    check-cast v17, LP/o;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    iget v1, v0, LM/V;->D:I

    .line 15
    .line 16
    or-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {v1}, LP/b;->w(I)I

    .line 19
    .line 20
    .line 21
    move-result v18

    .line 22
    iget v1, v0, LM/V;->E:I

    .line 23
    .line 24
    move/from16 v19, v1

    .line 25
    .line 26
    iget-object v1, v0, LM/V;->q:LB5/a;

    .line 27
    .line 28
    iget-object v2, v0, LM/V;->r:Lc0/m;

    .line 29
    .line 30
    iget-object v3, v0, LM/V;->s:LM/I0;

    .line 31
    .line 32
    iget v4, v0, LM/V;->t:F

    .line 33
    .line 34
    iget-object v5, v0, LM/V;->u:Lj0/E;

    .line 35
    .line 36
    iget-wide v6, v0, LM/V;->v:J

    .line 37
    .line 38
    iget-wide v8, v0, LM/V;->w:J

    .line 39
    .line 40
    iget v10, v0, LM/V;->x:F

    .line 41
    .line 42
    iget-wide v11, v0, LM/V;->y:J

    .line 43
    .line 44
    iget-object v13, v0, LM/V;->z:LB5/e;

    .line 45
    .line 46
    iget-object v14, v0, LM/V;->A:LB5/e;

    .line 47
    .line 48
    iget-object v15, v0, LM/V;->B:LM/h0;

    .line 49
    .line 50
    move-object/from16 v16, v1

    .line 51
    .line 52
    iget-object v1, v0, LM/V;->C:LX/e;

    .line 53
    .line 54
    move-object/from16 v20, v16

    .line 55
    .line 56
    move-object/from16 v16, v1

    .line 57
    .line 58
    move-object/from16 v1, v20

    .line 59
    .line 60
    invoke-static/range {v1 .. v19}, LM/g0;->a(LB5/a;Lc0/m;LM/I0;FLj0/E;JJFJLB5/e;LB5/e;LM/h0;LX/e;LP/o;II)V

    .line 61
    .line 62
    .line 63
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 64
    .line 65
    return-object v1
.end method
