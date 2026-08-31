.class public final LM/w0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic A:I

.field public final synthetic B:I

.field public final synthetic q:Lc0/m;

.field public final synthetic r:LB5/e;

.field public final synthetic s:LB5/e;

.field public final synthetic t:LB5/e;

.field public final synthetic u:LB5/e;

.field public final synthetic v:I

.field public final synthetic w:J

.field public final synthetic x:J

.field public final synthetic y:LA/W;

.field public final synthetic z:LX/e;


# direct methods
.method public constructor <init>(Lc0/m;LB5/e;LB5/e;LB5/e;LB5/e;IJJLA/W;LX/e;II)V
    .locals 0

    .line 1
    iput-object p1, p0, LM/w0;->q:Lc0/m;

    .line 2
    .line 3
    iput-object p2, p0, LM/w0;->r:LB5/e;

    .line 4
    .line 5
    iput-object p3, p0, LM/w0;->s:LB5/e;

    .line 6
    .line 7
    iput-object p4, p0, LM/w0;->t:LB5/e;

    .line 8
    .line 9
    iput-object p5, p0, LM/w0;->u:LB5/e;

    .line 10
    .line 11
    iput p6, p0, LM/w0;->v:I

    .line 12
    .line 13
    iput-wide p7, p0, LM/w0;->w:J

    .line 14
    .line 15
    iput-wide p9, p0, LM/w0;->x:J

    .line 16
    .line 17
    iput-object p11, p0, LM/w0;->y:LA/W;

    .line 18
    .line 19
    iput-object p12, p0, LM/w0;->z:LX/e;

    .line 20
    .line 21
    iput p13, p0, LM/w0;->A:I

    .line 22
    .line 23
    iput p14, p0, LM/w0;->B:I

    .line 24
    .line 25
    const/4 p1, 0x2

    .line 26
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    check-cast v13, LP/o;

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
    iget v1, v0, LM/w0;->A:I

    .line 15
    .line 16
    or-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {v1}, LP/b;->w(I)I

    .line 19
    .line 20
    .line 21
    move-result v14

    .line 22
    iget v15, v0, LM/w0;->B:I

    .line 23
    .line 24
    iget-object v1, v0, LM/w0;->q:Lc0/m;

    .line 25
    .line 26
    iget-object v2, v0, LM/w0;->r:LB5/e;

    .line 27
    .line 28
    iget-object v3, v0, LM/w0;->s:LB5/e;

    .line 29
    .line 30
    iget-object v4, v0, LM/w0;->t:LB5/e;

    .line 31
    .line 32
    iget-object v5, v0, LM/w0;->u:LB5/e;

    .line 33
    .line 34
    iget v6, v0, LM/w0;->v:I

    .line 35
    .line 36
    iget-wide v7, v0, LM/w0;->w:J

    .line 37
    .line 38
    iget-wide v9, v0, LM/w0;->x:J

    .line 39
    .line 40
    iget-object v11, v0, LM/w0;->y:LA/W;

    .line 41
    .line 42
    iget-object v12, v0, LM/w0;->z:LX/e;

    .line 43
    .line 44
    invoke-static/range {v1 .. v15}, LM/z0;->a(Lc0/m;LB5/e;LB5/e;LB5/e;LB5/e;IJJLA/W;LX/e;LP/o;II)V

    .line 45
    .line 46
    .line 47
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 48
    .line 49
    return-object v1
.end method
