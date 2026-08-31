.class public final synthetic LZ4/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Lcom/web2native/MainActivity;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:J

.field public final synthetic u:LB5/c;


# direct methods
.method public synthetic constructor <init>(Lcom/web2native/MainActivity;Ljava/lang/String;Ljava/lang/String;JLB5/c;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ4/y;->q:Lcom/web2native/MainActivity;

    iput-object p2, p0, LZ4/y;->r:Ljava/lang/String;

    iput-object p3, p0, LZ4/y;->s:Ljava/lang/String;

    iput-wide p4, p0, LZ4/y;->t:J

    iput-object p6, p0, LZ4/y;->u:LB5/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, LP/o;

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
    move-result v7

    .line 14
    iget-object v0, p0, LZ4/y;->q:Lcom/web2native/MainActivity;

    .line 15
    .line 16
    iget-object v1, p0, LZ4/y;->r:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, p0, LZ4/y;->s:Ljava/lang/String;

    .line 19
    .line 20
    iget-wide v3, p0, LZ4/y;->t:J

    .line 21
    .line 22
    iget-object v5, p0, LZ4/y;->u:LB5/c;

    .line 23
    .line 24
    invoke-static/range {v0 .. v7}, LZ4/L;->c(Lcom/web2native/MainActivity;Ljava/lang/String;Ljava/lang/String;JLB5/c;LP/o;I)V

    .line 25
    .line 26
    .line 27
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 28
    .line 29
    return-object p1
.end method
