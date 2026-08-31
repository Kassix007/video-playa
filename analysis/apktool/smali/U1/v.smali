.class public final synthetic LU1/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LT1/u;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Lc0/m;

.field public final synthetic t:Lc0/e;

.field public final synthetic u:LB5/c;

.field public final synthetic v:LB5/c;

.field public final synthetic w:LB5/c;

.field public final synthetic x:LB5/c;

.field public final synthetic y:LB5/c;


# direct methods
.method public synthetic constructor <init>(LT1/u;Ljava/lang/String;Lc0/m;Lc0/e;LB5/c;LB5/c;LB5/c;LB5/c;LB5/c;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU1/v;->q:LT1/u;

    iput-object p2, p0, LU1/v;->r:Ljava/lang/String;

    iput-object p3, p0, LU1/v;->s:Lc0/m;

    iput-object p4, p0, LU1/v;->t:Lc0/e;

    iput-object p5, p0, LU1/v;->u:LB5/c;

    iput-object p6, p0, LU1/v;->v:LB5/c;

    iput-object p7, p0, LU1/v;->w:LB5/c;

    iput-object p8, p0, LU1/v;->x:LB5/c;

    iput-object p9, p0, LU1/v;->y:LB5/c;

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
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, LP/b;->w(I)I

    .line 11
    .line 12
    .line 13
    move-result v10

    .line 14
    iget-object v0, p0, LU1/v;->q:LT1/u;

    .line 15
    .line 16
    iget-object v1, p0, LU1/v;->r:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, p0, LU1/v;->s:Lc0/m;

    .line 19
    .line 20
    iget-object v3, p0, LU1/v;->t:Lc0/e;

    .line 21
    .line 22
    iget-object v4, p0, LU1/v;->u:LB5/c;

    .line 23
    .line 24
    iget-object v5, p0, LU1/v;->v:LB5/c;

    .line 25
    .line 26
    iget-object v6, p0, LU1/v;->w:LB5/c;

    .line 27
    .line 28
    iget-object v7, p0, LU1/v;->x:LB5/c;

    .line 29
    .line 30
    iget-object v8, p0, LU1/v;->y:LB5/c;

    .line 31
    .line 32
    invoke-static/range {v0 .. v10}, Ll6/d;->g(LT1/u;Ljava/lang/String;Lc0/m;Lc0/e;LB5/c;LB5/c;LB5/c;LB5/c;LB5/c;LP/o;I)V

    .line 33
    .line 34
    .line 35
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 36
    .line 37
    return-object p1
.end method
