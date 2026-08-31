.class public final LM/v;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LB5/a;

.field public final synthetic r:Lc0/m;

.field public final synthetic s:Z

.field public final synthetic t:LM/u;

.field public final synthetic u:LX/e;

.field public final synthetic v:I

.field public final synthetic w:I


# direct methods
.method public constructor <init>(LB5/a;Lc0/m;ZLM/u;LX/e;II)V
    .locals 0

    .line 1
    iput-object p1, p0, LM/v;->q:LB5/a;

    .line 2
    .line 3
    iput-object p2, p0, LM/v;->r:Lc0/m;

    .line 4
    .line 5
    iput-boolean p3, p0, LM/v;->s:Z

    .line 6
    .line 7
    iput-object p4, p0, LM/v;->t:LM/u;

    .line 8
    .line 9
    iput-object p5, p0, LM/v;->u:LX/e;

    .line 10
    .line 11
    iput p6, p0, LM/v;->v:I

    .line 12
    .line 13
    iput p7, p0, LM/v;->w:I

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
    .locals 8

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, LP/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, LM/v;->v:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, LP/b;->w(I)I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget v7, p0, LM/v;->w:I

    .line 18
    .line 19
    iget-object v0, p0, LM/v;->q:LB5/a;

    .line 20
    .line 21
    iget-object v1, p0, LM/v;->r:Lc0/m;

    .line 22
    .line 23
    iget-boolean v2, p0, LM/v;->s:Z

    .line 24
    .line 25
    iget-object v3, p0, LM/v;->t:LM/u;

    .line 26
    .line 27
    iget-object v4, p0, LM/v;->u:LX/e;

    .line 28
    .line 29
    invoke-static/range {v0 .. v7}, LM/s0;->c(LB5/a;Lc0/m;ZLM/u;LX/e;LP/o;II)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 33
    .line 34
    return-object p1
.end method
