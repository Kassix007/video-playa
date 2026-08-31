.class public final LM/p0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LB5/a;

.field public final synthetic r:Lc0/m;

.field public final synthetic s:J

.field public final synthetic t:J

.field public final synthetic u:I

.field public final synthetic v:F

.field public final synthetic w:LB5/c;


# direct methods
.method public constructor <init>(LB5/a;Lc0/m;JJIFLB5/c;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LM/p0;->q:LB5/a;

    .line 2
    .line 3
    iput-object p2, p0, LM/p0;->r:Lc0/m;

    .line 4
    .line 5
    iput-wide p3, p0, LM/p0;->s:J

    .line 6
    .line 7
    iput-wide p5, p0, LM/p0;->t:J

    .line 8
    .line 9
    iput p7, p0, LM/p0;->u:I

    .line 10
    .line 11
    iput p8, p0, LM/p0;->v:F

    .line 12
    .line 13
    iput-object p9, p0, LM/p0;->w:LB5/c;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, LP/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    const/16 p1, 0x31

    .line 10
    .line 11
    invoke-static {p1}, LP/b;->w(I)I

    .line 12
    .line 13
    .line 14
    move-result v10

    .line 15
    iget-object v0, p0, LM/p0;->q:LB5/a;

    .line 16
    .line 17
    iget-object v1, p0, LM/p0;->r:Lc0/m;

    .line 18
    .line 19
    iget-wide v2, p0, LM/p0;->s:J

    .line 20
    .line 21
    iget-wide v4, p0, LM/p0;->t:J

    .line 22
    .line 23
    iget v6, p0, LM/p0;->u:I

    .line 24
    .line 25
    iget v7, p0, LM/p0;->v:F

    .line 26
    .line 27
    iget-object v8, p0, LM/p0;->w:LB5/c;

    .line 28
    .line 29
    invoke-static/range {v0 .. v10}, LM/q0;->b(LB5/a;Lc0/m;JJIFLB5/c;LP/o;I)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 33
    .line 34
    return-object p1
.end method
