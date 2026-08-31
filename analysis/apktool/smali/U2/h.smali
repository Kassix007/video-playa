.class public abstract LU2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LI2/l;

.field public static final b:LI2/l;

.field public static final c:LI2/l;

.field public static final d:LI2/l;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, LI2/l;

    .line 2
    .line 3
    sget-object v1, Ln5/s;->q:Ln5/s;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LI2/l;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LU2/h;->a:LI2/l;

    .line 9
    .line 10
    new-instance v0, LI2/l;

    .line 11
    .line 12
    new-instance v1, LV2/h;

    .line 13
    .line 14
    new-instance v2, LV2/a;

    .line 15
    .line 16
    const/16 v3, 0x1000

    .line 17
    .line 18
    invoke-direct {v2, v3}, LV2/a;-><init>(I)V

    .line 19
    .line 20
    .line 21
    new-instance v4, LV2/a;

    .line 22
    .line 23
    invoke-direct {v4, v3}, LV2/a;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v2, v4}, LV2/h;-><init>(LV2/c;LV2/c;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, LI2/l;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, LU2/h;->b:LI2/l;

    .line 33
    .line 34
    new-instance v0, LI2/l;

    .line 35
    .line 36
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-direct {v0, v1}, LI2/l;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, LU2/h;->c:LI2/l;

    .line 42
    .line 43
    new-instance v0, LI2/l;

    .line 44
    .line 45
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-direct {v0, v1}, LI2/l;-><init>(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sput-object v0, LU2/h;->d:LI2/l;

    .line 51
    .line 52
    return-void
.end method
